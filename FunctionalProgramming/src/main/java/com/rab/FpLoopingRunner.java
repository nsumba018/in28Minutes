package com.rab;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FpLoopingRunner {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        List<String> list = List.of("Apple","Bat", "Banana", "Dog", "Cat");
        printWithFPandFiltering (list);
    }

    //Printing normally without FP
    public static void printBasic(List<String> list) {
        for (String string : list)
            if (string.endsWith("at")) {
                System.out.println(string);
            }

    }

    //Printing with Functional Programming
    public static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }
    public static void printWithFPandFiltering(List<String> list){
        list.stream().
                filter(element -> element.endsWith("at")).
                forEach(element -> System.out.println(element));
    }
}