package com.propellerads.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Обычно для каждого теста создаётся новый инстанс тестового класса.
 * ЧТобы уйти от этого и указания полей и методов статическими
 * можно добавить аннотацию в классу:
 * @TestInstance(Lifecycle.PER_CLASS)
 * и будет использоваться один инстанс этого класса для всех тестов
 *
 */

public class JUnit5DataProvidersTests {

    private long systemTime = System.currentTimeMillis();

    //@Test - NOT NEEDED !!!
    @ParameterizedTest
    @DisplayName("Check sum with data-provider")
    @MethodSource("demoMethodDataProvider")
    void checkSum(int arg1, int arg2, int result){
        System.out.println(systemTime);
        Assertions.assertTrue(
                (arg1 + arg2) == result,
                "Wrong result"
        );
    }

    static Stream<Arguments> demoMethodDataProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5)
        );
    }

    @ParameterizedTest
    @DisplayName("Check sum with data-provider")
    @MethodSource("multiplierTestDataProvider")
    void checkMultiplier(int arg1, int arg2, int result){
        System.out.println(systemTime);
        Assertions.assertTrue(
                (arg1 * arg2) == result,
                "Wrong result"
        );
    }

    static Stream<Arguments> multiplierTestDataProvider() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(2, 3, 6)
        );
    }
}
