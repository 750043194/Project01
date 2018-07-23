package com.atguigu.java;

import com.atguigu.java.service.StudentService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    StudentService studentService;
    private static final int INITSIZE = 10;
    private static Student student;

    public static void main(String[] args) {
        //region aa
        System.out.println("hello world!");
        ArrayList arrayList = null;
        Date date = new Date();
        student = new Student();
        //endregion

        try {
            FileInputStream fs=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        add();

    }

    private static void add() {
        int m=1;
        int n=2;
        int sum=0;
        sum=m+n;
    }
}
