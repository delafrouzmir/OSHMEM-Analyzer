/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshmem.analyzer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Delafrouz
 */
public class OSHMEMAnalyzer {
    
    Hashtable<String, Variable> vars;
    Hashtable<String, Function> functions;
    ArrayList<Line> lines;
    LineAnalyzer la;

    public OSHMEMAnalyzer() {
        vars = new Hashtable<String, Variable>();
        functions = new Hashtable<String, Function>();
        lines = new ArrayList<Line>();
        la = new LineAnalyzer();
        analyze();
    }
    
    public void analyze (){
        Scanner in = new Scanner(System.in);

        Line l;
        int i = 0;

        while (in.hasNextLine()) {
            i++;
            l = new Line(in.nextLine(), i);

            this.lines.add (la.analyze(l, this) );
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new OSHMEMAnalyzer();
        
    }
    
}
