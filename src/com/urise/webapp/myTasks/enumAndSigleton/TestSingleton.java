package com.urise.webapp.myTasks.enumAndSigleton;

public class TestSingleton {
    private static TestSingleton instance;

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton() {
    }

    public static void main(String[] args) {
        TestSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.ordinal());

        for (EnumTestPlanet type : EnumTestPlanet.values()) {
            System.out.println("weight of planet - "+type.mass());
        }
    }

    public enum Singleton {
        INSTANCE
    }
}
