package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(new int[]{0, 0}));
    }

    @Test
    public void testExample1() {
        Assert.assertEquals(1, s.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
