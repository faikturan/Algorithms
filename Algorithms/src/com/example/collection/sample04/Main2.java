package com.example.collection.sample04;

import java.util.LinkedList;
import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        Stack<String> yigin = new Stack<>();

        yigin.add("Emre");
        yigin.add("Hasan");
        yigin.add("Ali");
        System.out.println(yigin);

        System.out.println(yigin.pop());
        System.out.println(yigin);
        System.out.println(yigin.peek());
        System.out.println(yigin);
        System.out.println(yigin.push("Can"));
        System.out.println(yigin);
        System.out.println(yigin.search("Hasan"));
        System.out.println(yigin.empty());

        LinkedList<String> yigin2 = new LinkedList<>();
        yigin2.push("asa");
        yigin2.push("asdasdas");
        yigin2.push("asdasdasasdda");

        System.out.println(yigin2.pop());
        System.out.println(yigin2);




    }
}
