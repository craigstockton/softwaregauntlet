package com.teksystemsgs.herokuapp.gauntlet.environment;

public class ProductionEnvironment extends EnvironmentDefinition {

    private ProductionEnvironment() {
        this.DOMAIN_URI = "http://the-internet.herokuapp.com";
    }

    public static ProductionEnvironment getInstance() {
        return new ProductionEnvironment();
    }

    public String getDomainUri() {
        return DOMAIN_URI;
    }
}
