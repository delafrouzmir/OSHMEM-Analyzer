package oshmem.analyzer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delafrouz
 */


enum LineType {
    FUNCDEC,
    VARDEC,
    FUNCCALL,
    COMPUTATION,
    IFSTATEMENT,
    LOOPSTATEMENT,
    RETURNSTATEMENT,
    INOUT,
    OTHER,
    EMPTY   // empty lines are comments, brackets, or empty
}


class Variable {
    
    String name;
    Line declareStart;
    Line[] used;
    Line[] change;
    VarFuncType type;
    
    
}

class Function {
    String name;
    Line declareStart;
    Line declareEnd;
    VarFuncType type;
    Line[] called;
}

class Line {
    String wholeLine;
    LineType type;
    int lineNum;
    
    
    Line ( String str ){
        wholeLine = str;
    }
    
    Line ( String str, int num ){
        wholeLine = str;
        lineNum = num;
    }
    
    LineType getLineType (){
        
        String testStr = wholeLine;
        if ( testStr.endsWith(";") )
            testStr = testStr.substring(0, testStr.length()-1);
        
        String[] parts = testStr.split ("[ \t\n{}]");
        
        for (String s : parts) {
            System.out.println(s);
        }
        
        if ( parts.length < 1 )
            return LineType.EMPTY;
        
        for ( VarFuncType type : VarFuncType.values() )
            if ( parts[0].equals(type.getValue()) || 
                    ( parts[0].endsWith("*") && parts[0].substring(0, parts[0].length()-1).equals(type.getValue())) ){
                // it is either a function or variable declaration
                if ( testStr.indexOf('(') < 0 )
                    return LineType.VARDEC;
                
                if ( testStr.indexOf('=') > testStr.indexOf('(') )
                    return LineType.FUNCDEC;
                
                if ( testStr.indexOf('=') < 0 )
                    return LineType.FUNCDEC;
                
                return LineType.VARDEC;
            }
        
        parts = testStr.split("[ \t\n(){};]");
        
        switch (parts[0]) {
            case "return":
                return LineType.RETURNSTATEMENT;
            case "if":
                return LineType.IFSTATEMENT;
            case "for":
                return LineType.LOOPSTATEMENT;
            case "while":
                return LineType.LOOPSTATEMENT;
        }
        
        return LineType.OTHER;
    }
}

public class LineAnalyzer {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    Line analyze (Line line, OSHMEMAnalyzer osa) {
        
        
        line.type = line.getLineType();
        String name;
        
        switch (line.type) {
            case FUNCDEC:
                Function func = new Function (line);
                osa.functions.put(func.name, func);
                break;
            
            case VARDEC:
                Variable var = new Variable(line);
                osa.vars.put(var.name, var);
                break;
            case OTHER:
                
                break;
            
        }
        return line;
    }

}
