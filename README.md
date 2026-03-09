# Debugging Study

## Instructions

1. Run the program
2. Observe the error
3. Use the debugger to find the bug
4. Fix the code
5. Commit your solution

Use F5 to start the debugger.

1. RUN TESTS:
   mvn test
   → BugATest fails
2. OPEN FILES:
   src/main/java/study/BugA.java
   tools/toolA/bugA_candidates.json  (ToolA condition)
3. FIX BUG:
   Edit BugA.java → mvn test → ALL PASS ✓
4. COMMIT (CRITICAL - enables timing analysis):
   git add .
   git commit -m "DONE BugA_ToolA"
   git push origin main
