package com.design.pattern.creational.singleton;

public class LazySingleton {

    private LazySingleton() {

    }

    private static volatile LazySingleton instance;

    /*this code handled multi-threading*/
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null)
                    instance = new LazySingleton();
            }
        }

        return instance;
    }

}
