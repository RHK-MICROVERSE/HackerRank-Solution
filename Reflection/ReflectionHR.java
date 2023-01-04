package Reflection;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Class;

public class ReflectionHR {
    
    public static void main(String[] args) throws Exception{

        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
