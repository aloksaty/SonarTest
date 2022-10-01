package com.alok.Demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInterviewClass {
    InterviewClass interviewClass;
    @Before
    public void init(){
        interviewClass = new InterviewClass();
    }
    @Test
    public void test_one(){

        Assert.assertEquals(interviewClass.display(),"Hello World");
    }
    @Test
    public void test_two(){

        Assert.assertTrue(interviewClass.display().length()!=0);

    }
    @Test
    public void test_three(){

        Assert.assertTrue(interviewClass.display().equalsIgnoreCase("hello world"));

    }
    @Test
    public void test_four(){

        Assert.assertTrue(interviewClass.display().getClass().equals(String.class));

    }
}
