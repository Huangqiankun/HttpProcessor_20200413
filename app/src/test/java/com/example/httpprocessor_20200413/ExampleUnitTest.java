package com.example.httpprocessor_20200413;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

//        ArrayList<? super Person> list=new ArrayList();
//        Person p=new Person("jett");
//        list.add(p);
//
//        Person p2=list.get(0);




    }
    class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }
    }

    public static class User{
        public int id=0;
        public String name="";
    }
    public static void alloc(){
        User u=new User();
        u.id=1;
        u.name="jett";
    }
    /**
     * 虚拟机优化技术--逃逸分析
     */
    @Test
    public void test(){
        long start=System.currentTimeMillis();
        //申请一亿个User
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

}