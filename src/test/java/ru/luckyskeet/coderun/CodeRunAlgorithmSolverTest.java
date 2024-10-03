package ru.luckyskeet.coderun;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

public class CodeRunAlgorithmSolverTest {

    private final CodeRunAlgorithmSolver solver = new CodeRunAlgorithmSolver();

    public static Stream<Arguments> provideArraysForFindMaxFrequency() {
        return Stream.of(
                of(new int[]{1, 2, 2, 3, 1}, 2),
                of(new int[]{3, 3, 2, 1, 2, 3}, 3),
                of(new int[]{1, 1, 1, 2, 2}, 1),
                of(new int[]{}, 0) // Учитывая, что возвращаемое значение по умолчанию 0
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForFindMaxFrequency")
    public void testFindMaxFrequency(int[] input, int expected) {
        assertEquals(expected, solver.findMaxFrequency(input));
    }

    @ParameterizedTest
    @CsvSource({
            "'3,1,2', 2",
            "'10,20,30', 20",
            "'5,3,8', 5"
    })
    void testFindMiddleElemWithSort(String input, int expected) {
        String[] arr = input.split(",");
        assertEquals(expected, solver.findMiddleElemWithSort(arr));
    }

    @ParameterizedTest
    @CsvSource({
            "'3,1,2', 2",
            "'10,20,30', 20",
            "'5,3,8', 5"
    })
    void testFindMiddleElemWithMath(String input, int expected) {
        String[] arr = input.split(",");
        assertEquals(expected, solver.findMiddleElemWithMath(arr));
    }

    static Stream<Arguments> provideArraysForUniqueCount() {
        return Stream.of(
                of(new Integer[]{1, 2, 2, 3}, 2),
                of(new Integer[]{1, 1, 2, 3}, 2),
                of(new Integer[]{1, 1, 1, 1}, 0),
                of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForUniqueCount")
    public void testGetUniqueCountWithMap(Integer[] input, int expected) {
        assertEquals(expected, solver.getUniqueCountWithMap(input));
    }

    @ParameterizedTest
    @MethodSource("provideArraysForUniqueCount")
    public void testGetUniqueCountWithSet(Integer[] input, int expected) {
        assertEquals(expected, solver.getUniqueCountWithSet(input));
    }
}
