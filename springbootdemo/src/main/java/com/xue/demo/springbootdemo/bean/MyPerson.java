package com.xue.demo.springbootdemo.bean;

/**
 * @author: xuexiong@souche.com
 * @date: 2021/2/2 11:35
 * @description:
 */

public class MyPerson {
    /**
     * 姓名
     */
    private String name;
    /**
     * 格言
     */
    private String word;

    public void myPersonInit() {
        System.out.println(" myNameInit");
    }

    public void myPersonDestroy() {
        System.out.println("myNameDestroy");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public MyPerson(String name, String word) {
        this.name = name;
        this.word = word;
    }

    public MyPerson() {
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", word='" + word + '\'' +
                '}';
    }
}
