package com.alok.action;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOperations {

    @Test
    public void addTest(){

        Assert.assertEquals(25,new Operations().add(12,13));
        Assert.assertEquals(25,new Operations().sum(12,13));
        Assert.assertEquals(25,new Operations().total(12,13));
        Assert.assertEquals(25,new Operations().addition(12,13));
        Assert.assertEquals(25,new MathsOperation().add(12,13));

    }
}
