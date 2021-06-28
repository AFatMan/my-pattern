package com.my.pattern.adapter;

public class Iphone {
    /**
     * 老子苹果,只能lighting插我
     */
    private Lightning lightning;

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "lightning=" + lightning +
                '}';
    }
}
