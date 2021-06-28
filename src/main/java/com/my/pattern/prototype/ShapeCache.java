package com.my.pattern.prototype;

import java.util.HashMap;

public class ShapeCache {

    public final static HashMap<String,Shape> cacheShape = new HashMap<>();

    static {
        loadShape();
    }

    public static Shape getShape(String id){
        Shape shape = cacheShape.get(id);


        return (Shape) shape.clone();
    }

    /*
    假如获取这些Circle很消耗资源,要经历查询数据库,校验等步骤,可以缓存进一个map,
    等到要使用时,不需要new Circle,只需通过getShape(),底层调用clone复制出一个对象
     */
    private static void loadShape(){
        Circle circle = new Circle();
        circle.setId("1");
        circle.setType("圆圆圆");
        cacheShape.put(circle.getId(),circle);
        Square square = new Square();
        square.setId("2");
        square.setType("方方方");
        cacheShape.put(square.getId(),square);
        Three three = new Three();
        three.setId("3");
        three.setType("三角");
        cacheShape.put(three.getId(),three);
    }

}
