package com.ninggc.demo.thinking_in_java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("test");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(1+1, 2);
    }

}