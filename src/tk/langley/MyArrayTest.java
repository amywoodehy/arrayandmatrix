package tk.langley;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyArrayTest {
    @Test
    public void testMax1() throws Exception {
        int[] r = {1,2,3,4,5};
        MyArray a = new My1dArray(r);
        assertEquals(5, a.max());
    }

    @Test
    public void testMin1() throws Exception {
        int[] r = {1,2,3,4,5};
        MyArray a = new My1dArray(r);
        assertEquals(1, a.min());
    }

    @Test
    public void testSum1() throws Exception {
        int[] r = {1,2,3,4,5};
        MyArray a = new My1dArray(r);
        assertEquals(15, a.sum());
    }

    @Test
    public void testAverage1() throws Exception {
        int[] r = {1,2,3,4,5};
        MyArray a = new My1dArray(r);
        assertEquals(3, a.average(), 0);
    }

    @Test
    public void testIsFiboSequence1() throws Exception {
        int[] r = {1,2,3,4,5};
        MyArray a = new My1dArray(r);
        assertFalse(a.isFiboSequence());
    }

    @Test
    public void testIsFiboSequence2() throws Exception {
        int[] r = {1,1,2,3,5};
        MyArray a = new My1dArray(r);
        assertFalse(a.isFiboSequence());
    }

    @Test
    public void testSorted() throws Exception {
        int[] r = {3,4,2,6,1,4,2,3};
        int[] t = {1,2,2,3,3,4,4,6};
        MyArray a = new My1dArray(r);

        MyArray b = a.sorted();
        assertArrayEquals(t, b.getArr());
    }

    @Test
    public void testReverseArray() throws Exception {
        int[] r = {3,4,2,6,1,4,2,3};
        int[] t = {3,2,4,1,6,2,4,3};
        MyArray a = new My1dArray(r);

        MyArray b = a.reverseArray();
        assertArrayEquals(t, b.getArr());
    }
}
