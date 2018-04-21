package com.littlejava;

public class MyArray {
    int[] array = new int[20];  // 定义了一个20个空间的数组

    static int index = 0;

    public void add(int num) {
        array[index] = num;
        index = index + 1;
    }

    public int max() {
        int max = array[0];
        for (int i = 1; i < index; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < index - 1; i++) {
            for(int j = 0; j < index - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public int length() {
        return index;
    }

    public int[] output() {
        int[] tempArr = new int[index];

        for (int i = 0; i < index; i++) {
            tempArr[i] = array[i];
        }

        return tempArr;
    }
}
