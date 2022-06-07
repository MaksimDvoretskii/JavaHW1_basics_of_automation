package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService hack = new CashbackHackService();

        int actual = hack.remain(900)
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);

    }
}