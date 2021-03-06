package com.ywh.olrn.jvm.instructions.loads;

import com.ywh.olrn.jvm.instructions.base.Index8Instruction;
import com.ywh.olrn.jvm.rtda.Frame;

public class lload_0 extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x1e;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getLocalVars().getLong(0);
        frame.getOperandStack().pushLong(val);
    }
}
