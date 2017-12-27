package com.ds;

import java.util.*;

public class HR_DS_15_Priority_Queue {
    public class Student{
        int id;
        String name;
        double cgpa;
        Student(int ID, String Name, double CGPA){
            id = ID;
            name = Name;
            cgpa = CGPA;
        }
        int getID(){
            return id;
        }
        String getName(){
            return name;
        }
        double getCGPA(){
            return cgpa;
        }
    }

    public class Priorities{
        //Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID)

        //Comparator<Student>
        PriorityQueue <Student> ST_Q = new PriorityQueue<Student>();
        List < Student > students = new ArrayList < Student > ();
        List<Student> getStudents(List<String> events){

            for (String e:events) {
                Scanner scan = new Scanner(e);
                String S1 = scan.next();
                if (S1.compareTo("ENTER")==0)
                {
                    String S2 = scan.next();
                    double S3 = scan.nextDouble();
                    int S4 = scan.nextInt();
                    Student std = new Student(S4,S2,S3);
                    ST_Q.add(std);

                } else if (S1.compareTo("SERVED")==0){
                    Student F = ST_Q.poll();
                }

            }
            Student first = ST_Q.poll();
            if (first == null) {
                return students;
            } else {
                while (first != null) {

                    students.add(first);
                    first = ST_Q.poll();

                }
                return students;
            }
        }
    }
    private final static Scanner scan = new Scanner(System.in);
    private final Priorities priorities = new Priorities();
    public void run() {

            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();

            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st: students) {
                    System.out.println(st.getName());
                }
            }
        }

}
