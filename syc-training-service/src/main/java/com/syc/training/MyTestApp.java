package com.syc.training;

import com.alibaba.fastjson.JSON;
import com.syc.training.sort.SelectionSort;

import java.util.Arrays;
import java.util.List;

public class MyTestApp {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3,2,4,1,6,5);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
        System.out.println(JSON.toJSONString(array));
    }
}
