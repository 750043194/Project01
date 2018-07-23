package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author cloud
 * @create 2018-07-23 9:19
 */

public class TemplateTest {
/**
 * customerName
 */
private String customerName="zhangsan" ;

    /**
     * x
     */
    private int x =1;
    
    /**
     * customer_id
     */
    private int customer_id =1;



    public void testAdd() {

    }

    public static void main(String[] args) {

        String[] arr = new String[]{"tom", "jerry", "hanmeimei", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }
        if (list == null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }


    }

    public int add(int i, int j) {
        System.out.println("i = [" + i + "], j = [" + j + "]");
        System.out.println("TemplateTest.add");


        return i + j;
    }
}




