package com.future.iterator_pattern.iterator;

/**
 * @Description:
 * @Author: lilei58
 * @Date: Created in 2022/5/24 上午7:21
 */
public interface Iterator {

    /**
     * 是否有下一个
     * @return
     */
    public boolean hasNext();

    /**
     * 下一个
     * @return
     */
    public Object next();

}
