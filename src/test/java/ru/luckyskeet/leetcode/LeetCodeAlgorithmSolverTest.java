package ru.luckyskeet.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeetCodeAlgorithmSolverTest {

    private final LeetCodeAlgorithmSolver solver = new LeetCodeAlgorithmSolver();

    static Stream<Arguments> provideTestCasesForTwoSum() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{1, 2, 3, 4}, 8, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForTwoSum")
    void testGetTwoSumONSquared(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, solver.getTwoSumONSquared(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForTwoSum")
    void testGetTwoSumON(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, solver.getTwoSumON(nums, target));
    }
}