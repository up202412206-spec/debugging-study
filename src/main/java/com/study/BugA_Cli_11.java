package com.study;

public class BugA_Cli_11 {
    public static void main(String[] args) {
        String fileArg = null;
        
        // Parse args manually
        for (int i = 0; i < args.length; i++) {
            if ("-f".equals(args[i]) && i + 1 < args.length) {
                fileArg = args[i + 1];
                break;
            }
        }
        
        // FAULTY STATEMENT #28: WRONG LOGIC!
        if (fileArg == null || fileArg.isEmpty()) {
            System.out.println("File: " + fileArg);  // Wrong branch!
        } else {
            System.err.println("ERROR: Missing file argument");
            
        }
 
        // STUDENT FIXED STATEMENT
       /*  
       if (fileArg == null || fileArg.isEmpty()) {
            System.err.println("ERROR...");
            // System.exit(1);
        } else {
            System.out.println("File: " + fileArg);
        } 
        */

    }
}
