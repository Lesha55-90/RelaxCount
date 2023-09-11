package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelaxServiceTest {
    @Test
    public void shouldCalcExact() {
        RelaxService service = new RelaxService();

        int expected = 2;
        int actual = service.calcRelax(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
