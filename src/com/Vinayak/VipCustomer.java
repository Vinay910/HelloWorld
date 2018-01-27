package com.Vinayak;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Vinayak mahajan", 4000.0, "default@yahoo.com");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "vinay910@yahoo.co.in");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
