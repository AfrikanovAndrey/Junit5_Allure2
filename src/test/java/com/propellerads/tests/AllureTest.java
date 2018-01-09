package com.propellerads.tests;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Это будет названием тестового класса")
public class AllureTest {

    @Test
    @DisplayName("Первый тест")
    @Owner("m.sidelnikov")
    @Description("Описание для теста <a href=\"http://yandex.ru\">ссылка на яндекс</a> <br> после переноса строки работает всё отлично")
    public void someTest() {

        firstStep();
    }

    @Step("Это первый шаг")
    private void firstStep() {
        makeAttach();
    }

    @Attachment(type = "application/json")
    public String makeAttach() {
        return "{\"name\":\"value\"}";
    }

    @Test
    @DisplayName("Второй тест тест")
    @Description("Описание для теста <a href=\"http://yandex.ru\">ссылка на яндекс</a> <br> после переноса строки работает всё отлично")
    @Owner("к.прибыльская")
    public void someTest2() {
        System.out.println(Pattern.compile("IllegalState*.", Pattern.DOTALL).matcher("IllegalStateException: Ошибочка вышла").matches());
        throw new IllegalStateException("IllegalStateException: Ошибочка вышла");
    }

    @Test
    @DisplayName("третий тест тест")
    @Description("Описание для теста <a href=\"http://yandex.ru\">ссылка на яндекс</a> <br> после переноса строки работает всё отлично")
    @Owner("к.прибыльская")
    public void someTest3() {
        throw new RuntimeException("RuntimeException: Ошибочка вышла, потому что мы криворукие");
    }

    @Test
    @DisplayName("третий тест тест")
    @Description("Описание для теста <a href=\"http://yandex.ru\">ссылка на яндекс</a> <br> после переноса строки работает всё отлично")
    @Owner("к.прибыльская")
    public void someTest4() {
        assertTrue(false,"Error while test: because code wrote a.moskvin");
    }

    @Test
    @DisplayName("третий тест тест")
    @Description("Описание для теста <a href=\"http://yandex.ru\">ссылка на яндекс</a> <br> после переноса строки работает всё отлично")
    @Owner("к.прибыльская")
    public void someTest5() {
        assertTrue(false, "Error while test - a.moskvin wrote this code");
    }

}
