package com.github.kotkanok;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class abcTest {
    @Test
    public void getType() throws Exception {
        abc triangle = new abc(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
