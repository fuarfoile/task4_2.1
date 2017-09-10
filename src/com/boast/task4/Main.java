/*
 * Main.java 04/08/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task4;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception{
	    String str = "Initialized string";

        Field field = str.getClass().getDeclaredField("value");
        field.setAccessible(true);

        System.out.println(str);
        field.set(str, "Modified string".toCharArray());
        System.out.println(str);
    }
}
