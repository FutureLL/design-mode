package com.future.mediator_pattern.mediator;

import com.future.mediator_pattern.vo.User;

import java.util.Date;

/**
 * @Description: 创建中介类
 * @Author: lilei58
 * @Date: Created in 2022/6/28 上午7:48
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }

}
