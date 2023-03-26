package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FreelancerTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ru.netology.services/test_data.csv")
    public void testWithParams(int income, int expenses, int threshold, int expected) {
        Freelancer service = new Freelancer();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}