var asmapi = Java.type('net.minecraftforge.coremod.api.ASMAPI');
var canEnchant = asmapi.mapMethod('m_6081_');

function initializeCoreMod() {
    return {
        'damage': {
            'target': {
                'type': 'CLASS',
                'name': 'net.minecraft.world.item.enchantment.ThornsEnchantment'
            },
            'transformer': function(classNode) {
                return patchShieldLogic(classNode);
            }
        }
    }
}

function patchShieldLogic(classNode) {
    var Opcodes = Java.type('org.objectweb.asm.Opcodes');
    var MethodInsnNode = Java.type('org.objectweb.asm.tree.MethodInsnNode');
    var owner = "com/tome/bettershields/Hooks";
    var methods = classNode.methods;
    var method = null;
    for(var i in methods) {
        if(methods[i].name == canEnchant) {
            method = methods[i];
            break;
        }
    }

    target = findFirstInstruction(method, Opcodes.IRETURN).getPrevious().getPrevious();
    method.instructions.remove(target.getNext());
    while(target.getOpcode() != Opcodes.INVOKEVIRTUAL) {
        target = target.getPrevious();
        method.instructions.remove(target.getNext());
    }

    method.instructions.insert(target, new MethodInsnNode(Opcodes.INVOKESTATIC, owner, 'canThornsApply', '(Lnet/minecraft/world/item/ItemStack;)Z', false));
    method.instructions.remove(target);
    return classNode;
}

function findFirstInstruction(method, opcode) {
    var instructions = method.instructions;
    for(var i = 0; i < instructions.size(); i++) {
        var instruction = instructions.get(i);
        if(instruction.getOpcode() == opcode) {
            return instruction;
        }
    }
}