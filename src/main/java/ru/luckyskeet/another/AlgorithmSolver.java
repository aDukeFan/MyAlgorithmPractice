package ru.luckyskeet.another;

import java.nio.charset.StandardCharsets;

public class AlgorithmSolver {

    public byte[] getFizzBuss(int v) throws Exception {
        if (v % 3 == 0 && v % 5 == 0) {
            return "FizzBuss".getBytes(StandardCharsets.UTF_8);
        } else if (v % 3 == 0) {
            return "Fizz".getBytes(StandardCharsets.UTF_8);
        } else if (v % 5 == 0) {
            return "Buzz".getBytes(StandardCharsets.UTF_8);
        } else {
            throw new RuntimeException("smth wrong");
        }
    }

}
