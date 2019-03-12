package com.design.pattern.creational.singleton;

public class LazySingleton2 {

    private LazySingleton2() {

    }

    private static class HolderClass {
        static LazySingleton2 instance = new LazySingleton2();
    }

    public static LazySingleton2 getInstance() {
        return HolderClass.instance;
    }
}
