package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcTest {
    static Calc calc = null;
    @BeforeAll
    static void テスト前処理() {
        calc = new Calc();
    }
    @Test
    void addテスト_正常() {
        assertEquals(calc.add(1, 3), 4);
        assertThat(calc.add(1, 3))
        .as("加算結果の確認")
        .isEqualTo(4);
    }
    @AfterAll
    static void addテスト後処理() {
        calc = null;
    }

    @Test
    void subテスト_正常() {
        assertEquals(calc.sub(3, 1), 2);
        assertThat(calc.sub(3, 1))
        .as("減算結果の確認")
        .isEqualTo(2);
    }
    @AfterAll
    static void subテスト後処理() {
        calc = null;
    }

    @Test
    void divテスト_正常() {
        assertEquals(calc.div(4, 2), 2);
        assertThat(calc.div(4, 2))
        .as("除算結果の確認")
        .isEqualTo(2);
    }
    @AfterAll
    static void divテスト後処理() {
        calc = null;
    }

    @Test
    void mulテスト_正常() {
        assertEquals(calc.mul(3, 2), 6);
        assertThat(calc.mul(3, 2))
        .as("乗算結果の確認")
        .isEqualTo(6);
    }
    @AfterAll
    static void multテスト後処理() {
        calc = null;
    }

    @Test
    void divテスト_異常() {
        assertThatExceptionOfType(ArithmeticException.class)
            .isThrownBy(() -> {
            calc.div(4, 0);
        }).withMessageContaining("by zero");


    }
    @AfterAll
    static void divテスト_異常後処理() {
        calc = null;
    }
}
