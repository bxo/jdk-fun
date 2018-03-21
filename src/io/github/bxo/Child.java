package io.github.bxo;

public interface Child extends Parent{
    default void hi(){
        System.out.println("hi from child");
    }
}
