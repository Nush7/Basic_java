package HEAP;

import java.util.*;

public class PriorityQueueBasics {
    private static class Student{
        String name;
        String dob;
        Integer rollNo;
        Integer marks;
    }
    private static class StudentComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.marks> s2.marks){
                return 1;
            }
            else if(s2.marks> s1.marks){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq= new PriorityQueue<>(); //will give min heap
//        PriorityQueue<Integer> pg1= new PriorityQueue<>(20); //minHeap of capacity 20
//        PriorityQueue<Integer> pq2= new PriorityQueue<>(pq); //will copy the first pq
//        PriorityQueue<Integer> pqMax= new PriorityQueue<>(Comparator.reverseOrder()); //max heap
        PriorityQueue<Student> studentPriorityQueue= new PriorityQueue<>(new StudentComparator());

        Student harsh= new Student();
        harsh.name= "Harsh";
        harsh.dob= "12-10-2001";
        harsh.rollNo= 14;
        harsh.marks= 97;
        studentPriorityQueue.add(harsh);

        Student raghav= new Student();
        raghav.name= "Raghav";
        raghav.dob= "1-12-2003";
        raghav.rollNo= 7;
        raghav.marks= 85;
        studentPriorityQueue.add(raghav);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);



    }

}
