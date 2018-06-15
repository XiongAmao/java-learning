package com.littlejava;

public class MyArray {
    // private 成员变量  -- 数组
    private int[] array; // 定义了一个20个空间的数组

    private int len;

    // 构造方法，构造函数 初始化方法， 方法名字和类名一样，没有返回值类型 ,在new时候会调用，类似于JS的new 一个函数里面 this对实例属性的处理
    public MyArray(int length) {
        array = new int[length];
        len = 0;
    }


    // static会指定为类的方法/变量 ，在类外部调用时，
    // 比如 在main里面的MyArray
    // 调用时 MyArray.class_method()

    public static void class_method(int x) {
        System.out.println(x);
    }

    public void add(int num) {
        array[len] = num;
        len = len + 1;
    }

    public int max() {
        int max = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < len - 1; i++) {
            for(int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public int length() {
        return len;
    }

    public int[] output() {
        int[] tempArr = new int[len];

        for (int i = 0; i < len; i++) {
            tempArr[i] = array[i];
        }

        return tempArr;
    }
}
