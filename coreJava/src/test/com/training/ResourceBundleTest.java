package com.training;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2016/5/7 0007.
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        Locale[] supportedLocales = {Locale.CHINESE, Locale.ENGLISH};
        ResourceBundle rb = ResourceBundle.getBundle("bundle", supportedLocales[1]);
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.out.println(key + " : " + value);
        }

    }
}
