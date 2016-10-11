package com.thoughtworks.helloWorld.learningReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LearningReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass myClass = new MyClass(0); //一般做法
        myClass.increase(2);
        System.out.println("Normal -> " + myClass.count);
        try {
            Constructor constructor = MyClass.class.getConstructor(int.class); //获取构造方法
            MyClass myClassReflect = (MyClass) constructor.newInstance(10); //创建对象
            Method method = MyClass.class.getMethod("increase", int.class);  //获取方法
            method.invoke(myClassReflect, 5); //调用方法
            Field field = MyClass.class.getField("count"); //获取域
            System.out.println("Reflect -> " + field.getInt(myClassReflect)); //获取域的值
        } catch (Exception e) {
            e.printStackTrace();
        }
//        LearningReflection.getReflectionClass();
    }

    private static void getReflectionClass() throws ClassNotFoundException {
        Class c1 = Class.forName("MyClass");
        try {
            c1.newInstance();
            Arrays.stream(c1.getDeclaredFields()).forEach(field -> {
                System.out.println(field.getName());
            });
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    int count;

    MyClass(int start) {
        count = start;
    }

    void increase(int step) {
        count = count + step;
    }

}