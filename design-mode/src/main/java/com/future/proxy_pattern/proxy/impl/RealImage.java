package com.future.proxy_pattern.proxy.impl;

import com.future.proxy_pattern.proxy.Image;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/6 上午8:25
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
