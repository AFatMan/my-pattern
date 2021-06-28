package com.my.pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleHashMap = new HashMap<>(128);

    public static Circle getCircleByColor(String color) {
        Circle circle = (Circle) circleHashMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleHashMap.put(color, circle);

            System.out.println("---------------------------------------create circle color is" + color);
        }
        return circle;
    }
}
