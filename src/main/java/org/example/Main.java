package org.example;

import org.example.java_overview.FirstExample;

/*
    1. java overview
    2. java data types, variable: ( static, non-static, instance)
    3. operators
    4. control statement: if, else, if else, else if, switch, break, continue
    5. looping statement: for, while, do while, labelled loop, enhanced for, forEach
    6. Array: 1D, 2D and multi dimension
    7. sorting: ( bubble, insertion and selection)
    8. searching: ( linear and binary)
    9. Pattern Logical & Series
    10. Scanner Class
    11. String Handling: ( immutable)
    12. StringBuffer & StringBuilder
    13. File Handling ( Stream And Buffer)
    14. Lambda Expression
    15. Generics: ( Class, Method and Interface)
    16. Exception Handling ( Checked and unchecked)
    17. MultiThreading : Life Cycle ( New, Runnable, Timed_Waited
        , Blocked, Waiting and Terminated)
        Daemon Thread, Deadlock
        ThreadPool
    18. Collection Framework: List, Stack, Queue, Dequeue (Stack + Queue), Set, Map, Hash
    19. Date & Time Handling, Timestamp
    20. MySql
    21. JDBC
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        FirstExample firstExample = new FirstExample();
        firstExample.sum(7, 6);
    }
}