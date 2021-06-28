package com.my.pattern.prototype;

import lombok.ToString;

import java.io.Serializable;

@ToString
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    /**
     * 基本数据类型是值传递，所以修改值后不会影响另一个对象的该属性值；
     *
     * 引用数据类型是地址传递（引用传递），所以修改值后另一个对象的该属性值会同步被修改。
     *
     * String比较特殊,虽然是引用类型,但是属于值传递(字符串常量池)
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
