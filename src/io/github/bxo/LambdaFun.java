package io.github.bxo;

import java.util.function.BinaryOperator;

public class LambdaFun {

    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("Hi");

        MyFunc myFunc = p -> System.out.println(p);

        noArguments.run();
        myFunc.go("world");

        BinaryOperator<Integer> add = (a,b)-> a+b;

        System.out.println(add.apply(2,3).toString());
    }

}
