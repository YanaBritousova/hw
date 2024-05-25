package Task4;

import java.util.*;

public class Main {

    public static final double minScore = 3;

    public static List<Student> exam(List<Student>students) {
        for(int i=0;i<students.size();i++){
            if (students.get(i).getMarks().stream().mapToInt(e->e).average().orElse(0.0)>=minScore){
                students.get(i).setCourse(students.get(i).getCourse().next());
            }
            else{
                students.remove(students.get(i));
                i--;
            }
        }
        return students;
    }

    public static void printStudents(List<Student>students, Course course){
        for (Student s: students){
            if (s.getCourse()==course) System.out.println(s.getName());;
        }
    }

    public static void main(String[]args){
        //task1
        ArrayList<String> countries = new ArrayList<>();
        Collections.addAll(countries,"USA","Australia","Spain");
        countries.add("Russia");
        countries.add("China");
        countries.add("Brazil");
        System.out.println(countries);

        countries.set(1,"France");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove("Brazil");
        System.out.println(countries);

        System.out.println(countries.indexOf("Russia"));
        System.out.println(countries.contains("Brazil"));

        //task2
        LinkedList<String> countries2 = new LinkedList<>();
        countries2.addFirst("Russia");
        countries2.addFirst("China");
        countries2.addLast("Brazil");
        countries2.addLast("Canada");
        System.out.println(countries2);

        countries2.removeFirst();
        countries2.removeLast();
        System.out.println(countries2);

        System.out.println(countries2.getFirst());
        System.out.println(countries2.getLast());

        //task3
        HashSet<Person> persons = new HashSet<>();
        Person p1 = new Person("Yana",21);
        Person p2 = new Person("Ann",14);
        Person p3 = new Person("Igor",30);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        for(Person p:persons){
            System.out.println(p.toString());
        }
        persons.remove(p2);
        persons.remove(p3);

        System.out.println(persons);
        System.out.println(persons.contains(p1));

        //task4
        List<Integer>m1 = new ArrayList<>();
        Collections.addAll(m1,3,3,2,2);
        Student s1 = new Student("Ann","ifst",Course.First,m1);

        List<Integer>m2 = new ArrayList<>();
        Collections.addAll(m2,4,4,4,4);
        Student s2 = new Student("Yana","ifst",Course.First,m2);

        List<Integer>m3 = new ArrayList<>();
        Collections.addAll(m3,4,4,4,5);
        Student s3 = new Student("Olga","ifst",Course.Second,m3);

        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,s1,s2,s3);


        List<Student> studentsAfterExam =  exam(students);
        for(Student s: studentsAfterExam){
            System.out.println(s.toString());
        }

        printStudents(studentsAfterExam,Course.Second);



    }
}
