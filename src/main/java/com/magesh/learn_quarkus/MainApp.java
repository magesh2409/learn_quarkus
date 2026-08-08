package com.magesh.learn_quarkus;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class MainApp implements QuarkusApplication {

    public static void main(String[] args) {
        Quarkus.run(MainApp.class, args);
    }

    @Override
    public int run(String[] args) throws Exception {
        System.out.println("Hello, Quarkus!");
        Quarkus.waitForExit();
        return 0;
    }
}
