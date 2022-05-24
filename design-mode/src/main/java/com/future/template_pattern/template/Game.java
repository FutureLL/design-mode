package com.future.template_pattern.template;

/**
 * @Description: 创建一个抽象类,它的模板方法被设置为 final
 * @Author: lilei58
 * @Date: Created in 2022/5/24 上午7:08
 */
public abstract class Game {

    /** 抽象方法 */
    public abstract void initialize();

    /** 抽象方法 */
    public abstract void startPlay();

    /** 抽象方法 */
    public abstract void endPlay();

    /**
     * 模板
     */
    public final void play() {

        // 初始化游戏
        initialize();

        // 开始游戏
        startPlay();

        // 结束游戏
        endPlay();
    }

}
