package com.design.pattern.creational.singleton;

public class Client {

    public static void main(String[] args) {

        EagerSingleton eagerObj1 = EagerSingleton.getInstance();
        EagerSingleton eagerObj2 = EagerSingleton.getInstance();

        System.out.println(eagerObj1 == eagerObj2);

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        System.out.println(lazySingleton == lazySingleton1);

        LazySingleton2 lazySingleton2 = LazySingleton2.getInstance();
        LazySingleton2 lazySingleton21 = LazySingleton2.getInstance();

        System.out.println(lazySingleton2 == lazySingleton21);

    }


}
