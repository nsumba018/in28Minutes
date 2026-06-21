package MethodReference;

import java.util.List;

public class MethodReferenceRunner {
    public static void print(Integer number){
        System.out.println(number);
    }
    public static void main(String[] args) {
        List.of("Ant", "Bat", "Elephant", "Dog", "Cat").stream()
                .map(String::length)
                .forEach(MethodReferenceRunner::print);
    }


}
