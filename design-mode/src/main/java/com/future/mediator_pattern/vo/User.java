package com.future.mediator_pattern.vo;

import com.future.mediator_pattern.mediator.ChatRoom;

/**
 * @Description: 创建 user 类
 * @Author: lilei58
 * @Date: Created in 2022/6/28 上午7:49
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

}
