package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateReminder() {

        CashbackHackService hack = new CashbackHackService();

        int actual = hack.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(expected,actual);
    }
}