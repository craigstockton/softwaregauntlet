package com.teksystemsgs.herokuapp.gauntlet.environment;

import com.sun.javafx.runtime.SystemProperties;

public class Environment {

    private static EnvironmentDefinition environment;

    private Environment() {
    }

    public static EnvironmentDefinition getInstance() {
        if (environment == null) {
            String environment = SystemProperties.getProperty("env");
            environment = environment == null ? "" : environment;
            switch (environment) {
                default:
                    Environment.environment = ProductionEnvironment.getInstance();
            }
        }
        return environment;
    }
}
