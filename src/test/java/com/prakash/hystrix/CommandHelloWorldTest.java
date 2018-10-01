package com.prakash.hystrix;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

public class CommandHelloWorldTest {
    @Test
    public void testJunitConfig(){
        assertTrue(true);
    }

    @Test
    public void testCommandHelloWorld() throws ExecutionException, InterruptedException {
        Future<String> fbob = new CommandHelloWorld("Bob").queue();
        Future<String> fjob = new CommandHelloWorld("Job").queue();
        assertEquals("Hello Bob!", fbob.get());
        assertEquals("Hello Job!", fjob.get());
    }
}
