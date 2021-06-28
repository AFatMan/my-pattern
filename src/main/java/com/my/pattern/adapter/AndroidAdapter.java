package com.my.pattern.adapter;

// 我是一根转接头
public class AndroidAdapter {

    Lightning lightning(AndroidPowerHead androidPowerHead) {
        System.out.println(androidPowerHead);
        Lightning lightning = new Lightning();
        lightning.i = androidPowerHead.i;
        lightning.u = androidPowerHead.u;
        if (lightning.i > 1 || lightning.u > 5) {
            System.out.println("太大了,扛不住,我帮你转一下ok?");

            lightning.i = androidPowerHead.i - 4;
            lightning.u = androidPowerHead.u - 15;
        }
        return lightning;
    }

}
