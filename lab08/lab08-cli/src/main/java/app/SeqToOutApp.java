/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import pwo.lab08.seq.SequenceTools;
import pwo.lab08.seq.Generator;

/**
 *
 * @author sofia
 */
public class SeqToOutApp extends SeqToFileApp{
    
    @Override
    protected boolean getArgs(String[] args){
        if(super.getArgs(args)) return true;
        
        return seqType != null && from >= 0 && to >= 0;
    }
    
    @Override
    protected boolean writeSeq() {
    System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
    return true;
    }
    
    @Override
    public void run(String[] args) {

System.out.println("Sequence to terminal CLI app");

if (!super.getArgs(args)) {
System.out.println("!Illegal arguments\n"
+ "Legal usage: seqName from to");
return;
}

writeSeq();
    
}
}
