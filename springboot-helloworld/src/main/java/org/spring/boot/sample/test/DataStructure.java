package org.spring.boot.sample.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructure {
    static DefaultStrategy strategy = new DefaultStrategy();

    public static void main(String[] args) {
        Integer list[] = {2, 3, 5, 7, 13, 11, 17, 19, 23, 29};
        Integer[] a=  insertSort(list, 0, 9);
        System.out.println(Arrays.stream(a).collect(Collectors.toList()));
    }

    public static Integer[] insertSort(Object[] r, int low, int high) {
        for (int i = low + 1; i <= high; i++)
            if (strategy.compare(r[i], r[i - 1]) < 0) {//小于时，需将 r[i]插入有序表
                Object temp = r[i];
                r[i] = r[i - 1];
                int j = i - 2;
                for (; j >= low && strategy.compare(temp, r[j]) < 0; j--)
                    r[j + 1] = r[j];//记录后移
                r[j + 1] = temp;//插入到正确位置
            }
            return (Integer[]) r;
    }

}