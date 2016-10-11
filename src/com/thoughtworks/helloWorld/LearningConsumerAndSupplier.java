package com.thoughtworks.helloWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LearningConsumerAndSupplier {
    public static void main(String[] args) {
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("ab");
        list.add("sdfsdf");
        list.add("23dfj");
        //将传入的 数据 转成大写字母 输出
        Consumer<String> stringConsumer = (s) -> System.out.println(s.toUpperCase());
        //将这个方法，放入到list的遍历中
        list.forEach(stringConsumer);
    }
}
