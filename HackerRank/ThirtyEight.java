package HackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ThirtyEight {

        public static void main(String[] args){
            Class student = Student.class; // Complete this line
        Method[] methods = student.getDeclaredMethods(); // Complete this line

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){ // Complete this line
            methodList.add(m.getName()); // Complete this line
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
        }

    }

