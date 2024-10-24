//Taichi Ite
//10.24.2024
//Recursive Problems with JUnit Testing

import static org.junit.Assert.*;
import org.junit.Test;

public class Count8Test {

    @Test
    public void testCount1() {
        assertEquals(1, Recursion.count8(8));
    }

    @Test
    public void testCount2() {
        assertEquals(2, Recursion.count8(88));
    }

    @Test
    public void testCount3() {
        // Test case
        assertEquals(2, Recursion.count8(812123128));
    }

    @Test
    public void testCount4() {
        // Test case
        assertEquals(3, Recursion.count8(818181313));
    }

    @Test
    public void testCount5() {
        // Test case
        assertEquals(0, Recursion.count8(0));
    }

    @Test
    public void testCount6() {
        // Test case
        assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void testCount7() {
        // Test case
        assertEquals(2, Recursion.countHi("xxhixxhi"));
    }

    @Test
    public void testCount8() {
        // Test case
        assertEquals(0, Recursion.countHi("null"));
    }
}