package com.my.pattern.builder;

/**
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * <p>
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * <p>
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候。
 * <p>
 * 如何解决：将变与不变分离开。
 * <p>
 * 关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
 * <p>
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
 * <p>
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 * <p>
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 * <p>
 * 使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
 * <p>
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 */
class Product {
    private String name;
    private String type;

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("型号：" + type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}

abstract class Builder {
    public abstract void setPart(String arg1, String arg2);

    public abstract Product getProduct();
}

class ConcreteBuilder extends Builder {
    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
}

class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }
}

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
