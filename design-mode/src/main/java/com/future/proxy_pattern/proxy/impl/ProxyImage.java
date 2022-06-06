package com.future.proxy_pattern.proxy.impl;

import com.future.proxy_pattern.proxy.Image;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:26
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
