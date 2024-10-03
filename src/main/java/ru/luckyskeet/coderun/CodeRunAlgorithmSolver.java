package ru.luckyskeet.coderun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CodeRunAlgorithmSolver {


    // isn't solved
    public int findMaxFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return 0;
    }

    public int findMiddleElemWithSort(String[] arr) {
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        Integer[] integers = {a, b, c};
        return Arrays.stream(integers).sorted().toList().get(1);
    }

    // O(1)
    public int findMiddleElemWithMath(String[] arr) {
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        return a + b + c
                - (Math.max((Math.max(a, b)), c))
                - (Math.min((Math.min(a, b)), c));
    }

    public int getUniqueCountWithMap(Integer[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        return (int) map.values().stream().filter(v -> v == 1).count();
    }

    //Faster
    public int getUniqueCountWithSet(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer integer : arr) {
            if (!set.add(integer)) {
                duplicates.add(integer);
            }
        }
        set.removeAll(duplicates);
        return set.size();
    }


}
