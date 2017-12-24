package com.ds;

import java.util.*;

public class HR_DS_12_Sort {
    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }
    public class Checker implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2){
            if(s1.cgpa==s2.cgpa){

                return (s1.fname.compareTo(s2.fname));
            }
            if(s2.cgpa - s1.cgpa > 0){
                return 1;
            }else if (s2.cgpa == s1.cgpa){
                if(s1.fname.compareTo(s2.fname)==0){
                    return s1.id - s2.id;
                }
                else{
                    return s1.fname.compareTo(s2.fname);
                }
            }else{
                return -1;
            }
        }
    };
// Sorting based on order - CGPI > First Name > Student roll
    public void run() {
        Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student(200, "John", 2.5);
        Student s2 = new Student(101, "Samiha", 3.5);
        Student s3 = new Student(102, "Samara", 3.5);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList, new Checker());

        for(Student st: studentList){
            System.out.println(st.getFname() + " : " + st.getId() + " : " + st.getCgpa());
        }
    }
}
