var asmapi = Java.type('net.minecraftforge.coremod.api.ASMAPI');
var canApply = asmapi.mapMethod('func_92089_a');

function initializeCoreMod() {
    return {
        'damage': {
            'target': {
                'type': 'CLASS',
                'name': 'net.minecraft.enchantment.ThornsEnchantment'
            },
            'transformer': function(classNode) {
                return patchShieldLogic(classNode);
            }
        }
    }
}

function patchShieldLogic(classNode) {
    var Opcodes = Java.type('org.objectweb.asm.Opcodes');
    var VarInsnNode = Java.type('org.objectweb.asm.tree.VarInsnNode');
    var MethodInsnNode = Java.type('org.objectweb.asm.tree.MethodInsnNode');
    var owner = "mod/mores/util/Hooks";
    var methods = classNode.methods;
    var method = null;
    for(var i in methods) {
        if(methods[i].name == canApply) {
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
    method.instructions.insert(target, new MethodInsnNode(Opcodes.INVOKESTATIC, owner, 'canThornsApply', '(Lnet/minecraft/item/ItemStack;)Z', false));
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