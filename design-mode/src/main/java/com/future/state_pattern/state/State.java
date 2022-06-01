package com.future.state_pattern.state;

import com.future.state_pattern.context.Context;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/6/2 上午7:26
 */
public interface State {

     /**
      * 执行 action
      *
      * @param context
      */
     void doAction(Context context);

}
