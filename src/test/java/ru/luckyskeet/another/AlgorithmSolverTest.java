package ru.luckyskeet.another;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgorithmSolverTest {

    public AlgorithmSolver algorithmSolver = new AlgorithmSolver();


    @ParameterizedTest
    @CsvSource({
            "15, FizzBuss", // кратно 3 и 5
            "9, Fizz",      // кратно 3
            "10, Buzz",     // кратно 5
            "7, exception"   // не кратно ни 3, ни 5
    })
    void testGetFizzBuss(int input, String expected) {
        if ("exception".equals(expected)) {
            RuntimeException exception = assertThrows(RuntimeException.class, () -> {
                algorithmSolver.getFizzBuss(input);
            });
        } else {
            byte[] result = assertDoesNotThrow(() -> algorithmSolver.getFizzBuss(input));
            assertArrayEquals(expected.getBytes(StandardCharsets.UTF_8), result);
        }
    }
}