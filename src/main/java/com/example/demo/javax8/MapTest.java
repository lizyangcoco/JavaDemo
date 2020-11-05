package com.example.demo.javax8;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author by 李泽阳 @on 2020/11/5 10:13
 * @description:
 */
public class MapTest {

    @Data
    static class Student {
        private String name;
        private String subject;
        private Integer score;

        public Student(String name, String subject, Integer score) {
            this.name = name;
            this.subject = subject;
            this.score = score;
        }
    }


    private static List<Student> initStudentList() {
        List<Student> resultList = new ArrayList<>(10);
        Student s1 = new Student("张三", "语文", 100);
        Student s2 = new Student("张三", "数学", 101);
        Student s3 = new Student("张三", "英语", 102);
        Student s4 = new Student("李四", "语文", 100);
        Student s5 = new Student("李四", "数学", 100);
        Student s6 = new Student("李四", "英语", 101);
        Student s7 = new Student("王五", "语文", 102);
        Student s8 = new Student("王五", "数学", 102);
        Student s9 = new Student("王五", "英语", 102);
        resultList.add(s1);
        resultList.add(s2);
        resultList.add(s3);
        resultList.add(s4);
        resultList.add(s5);
        resultList.add(s6);
        resultList.add(s7);
        resultList.add(s8);
        resultList.add(s9);
        return resultList;
    }

    /**
     * 计算：个人成绩总和
     */
    private static void personScoreTotal() {
        List<Student> studentList = initStudentList();
        Map<String, Integer> studentScoreMap = new HashMap<>(10);


        studentList.forEach(student -> {
            if (studentScoreMap.containsKey(student.getName())) {
                studentScoreMap.put(student.getName(), studentScoreMap.get(student.getName()) + student.getScore());
            } else {
                studentScoreMap.put(student.getName(), student.getScore());
            }
        });
        System.out.println(studentScoreMap);
    }

    /**
     * merge()
     */
    private static void merge() {
        List<Student> studentList = initStudentList();
        Map<String, Integer> studentScoreMap = new HashMap<>(10);
        studentList.forEach(student -> studentScoreMap.merge(student.getName(), student.getScore(), Integer::sum));
        System.out.println(studentScoreMap);

    }

    public static void main(String[] args) {
        personScoreTotal();
        merge();
    }
}
