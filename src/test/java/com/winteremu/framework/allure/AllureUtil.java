package com.winteremu.framework.allure;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import java.nio.charset.StandardCharsets;

public class AllureUtil {
    /**
     * Аннотацию @Step используется для регистрации данного сообщения журнала в Allure.
     *
     * @param message сообщение для входа в отчет allure
     */
    @Step("{0}")
    public static void logToAllure(String message) {}

    @Attachment(value = "json файл {str1}", type = "application/json", fileExtension = ".json")
    public static byte[] allureAttachJSON(String str1, String json) {
        return json.getBytes(StandardCharsets.UTF_8);
    }
}
