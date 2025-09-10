// singleton pattern
package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


public class FourtyTwo {
    public String str;

    // Step 2: Private static instance of Singleton
    private static Singleton instance = null;

    // Step 3: Private constructor
    private Singleton() {
    }

    // Step 4: Public static method to get the single instance
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

