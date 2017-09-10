package cn.jbit.epet.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static final String PREFIX = "DD";
    private static long code;

    public static void main(String[] args) {
        System.out.println(Test.nextCode());
        System.out.println(Test.nextCode());
        System.out.println(Test.nextCode());
    }

    public static synchronized String nextCode() {
        code++;
        String str = new SimpleDateFormat("yyyyMMddHHmmsss").format(new Date());
        long m = Long.parseLong((str)) * 10000;
        m += code;
        return PREFIX + m;
    }
}