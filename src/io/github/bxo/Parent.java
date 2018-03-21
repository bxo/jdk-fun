package io.github.bxo;

public interface Parent {
    void message();
    default void hi(){
        System.out.println("hi from parent");
    }
}
