package com.syc.training.sort;

import java.util.List;
import java.util.Objects;

public class SelectionSort {
    public void selectionSort(List<Integer> array) {
        if (Objects.isNull(array)) {
            return;
        }
        int n = array.size();
        for (int i = 0; i < n; ++i) {
            // 寻找[i, n)区间里的最小值
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public void swap(List<Integer> array, int i, int j) {
        Integer temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
