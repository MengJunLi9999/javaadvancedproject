package com.edli01;

import com.edli01.CommonUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.Date;

/**
 * @Project: javaadvancedproject
 * @Package: com.edli01
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-31 21:22
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class CommonUtilTest {
  private static final double DELTA = 0.000001; // 浮點數比較允許的誤差範圍

    @Test
    public void testAdd() {
        assertEquals(3.3, CommonUtil.add(1.1, 2.2), DELTA);
        assertEquals(0.3, CommonUtil.add(0.1, 0.2), DELTA);
        assertEquals(-1.0, CommonUtil.add(-2.0, 1.0), DELTA);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.1, CommonUtil.subtract(1.1, 2.2), DELTA);
        assertEquals(1.0, CommonUtil.subtract(2.0, 1.0), DELTA);
        assertEquals(-3.0, CommonUtil.subtract(-2.0, 1.0), DELTA);
    }

    @Test
    public void testMultiply() {
        assertEquals(2.42, CommonUtil.multiply(1.1, 2.2), DELTA);
        assertEquals(0.0, CommonUtil.multiply(1.0, 0.0), DELTA);
        assertEquals(-2.0, CommonUtil.multiply(2.0, -1.0), DELTA);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, CommonUtil.divide(4.0, 2.0, 2), DELTA);
        assertEquals(0.33, CommonUtil.divide(1.0, 3.0, 2), DELTA);
        assertEquals(3.333, CommonUtil.divide(10.0, 3.0, 3), DELTA);
    }

    @Test
    public void testDivideWithInvalidScale() {
        assertThrows(IllegalArgumentException.class, () -> {
            CommonUtil.divide(4.0, 2.0, -1);
        });
    }

    @Test
    public void testRound() {
        assertEquals(3.14, CommonUtil.round(3.14159, 2), DELTA);
        assertEquals(3.142, CommonUtil.round(3.14159, 3), DELTA);
        assertEquals(3.0, CommonUtil.round(3.0, 2), DELTA);
    }

    @Test
    public void testStringToDate() throws ParseException {
        String dateStr = "2024-01-01";
        Date date = CommonUtil.stringToDate(dateStr, "yyyy-MM-dd");
        assertNotNull(date);
        assertEquals(dateStr, CommonUtil.dateToString(date, "yyyy-MM-dd"));
    }

    @Test
    public void testStringToDateWithInvalidFormat() {
        assertThrows(ParseException.class, () -> {
            CommonUtil.stringToDate("2024-01-01", "yyyy/MM/dd");
        });
    }

    @Test
    public void testDateToString() {
        Date now = new Date();
        String dateStr = CommonUtil.dateToString(now, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(dateStr);
        assertTrue(dateStr.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }
}
