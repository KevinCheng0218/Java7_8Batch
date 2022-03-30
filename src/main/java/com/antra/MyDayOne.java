package com.antra;

import org.w3c.dom.ls.LSOutput;

public class MyDayOne {
    public static void main(String[] args) {
/*      // prints out
        System.out.println("Hello New Batch!");
        */

        //        int a = 1;
//        Integer b = new Integer(4);
//        System.out.println(a + b);
//        String s = "1_";
//        StringBuilder  sb1 = new StringBuilder("2_");
//        StringBuffer sb2 = new StringBuffer("3_");
//
//        cancat1(s);
//        cancat2(sb1);
//        cancat3(sb2);
//
//        System.out.println(s);
//        System.out.println(sb1.toString());
//        System.out.println(sb2.toString());
/*
        //String Constant Pool

        String s1 = ("Hello");
        String s2 = ("Hello");
        System.out.println(s1 == s2); // == means s1 & s2 both are pointed to the same object.

        String s3 = new String("abc");
        System.out.println(s1 == s3);

        String s4 = new String("abc");
        System.out.println(s3 == s4); // it's going return false, cause they are 2 objects in the hit area
*/

        // Integer Constants Pool

        Integer a = 10;
        Integer b = 10;
        Integer c = new Integer(10);
        System.out.println(a == b);
        System.out.println(a == c); // false, cause normally hit area and constant pool, they are different area in JVM.


        // Integer size -128- 127

        Integer d = 200;
        Integer e = 200;
        System.out.println(d == e); // false, cause Integer size is -128 ~ 127.

        Integer f = 66;
        Integer g = 66;
        System.out.println(f == g); // true, cause Integer size is -128 ~ 127.


//
        //
        //
    }
}
