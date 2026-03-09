package com.study;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class BugA_Cli_11Test {
    
    // Capture CLI output
    private String runCli(String[] args) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        PrintStream ps = new PrintStream(output);
        
        try {
            System.setOut(ps);
            System.setErr(ps);
            BugA_Cli_11.main(args);  // Now finds the class!
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            ps.close();
        }
        return output.toString().trim();
    }

    @Test
    public void testValidFileArg() {
        String[] args = {"-f", "input.txt"};
        String output = runCli(args);
        // FAILS due to stmt #28 bug
        assertFalse(output.contains("ERROR"), "Should NOT show ERROR");
        assertTrue(output.contains("File: input.txt"));
    }
}
