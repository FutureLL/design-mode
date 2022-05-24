package com.future.iterator_pattern.iterator.impl;

import com.future.iterator_pattern.iterator.Container;
import com.future.iterator_pattern.iterator.Iterator;

/**
 * @Description: 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator
 * @Author: lilei58
 * @Date: Created in 2022/5/24 上午7:20
 */
public class NameRepository implements Container {

    public final static String[] NAMES = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < NAMES.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return NAMES[index++];
            }
            return null;
        }
    }
}