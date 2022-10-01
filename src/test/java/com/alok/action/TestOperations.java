package com.alok.action;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOperations {

    @Test
    public void addTest(){

        Assert.assertEquals(25,new Operations().add(12,13));
    }
}
