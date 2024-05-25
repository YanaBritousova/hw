package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Student {

    private String name;
    private String group;
    private Course course;
    private List<Integer> marks;

    public Student(String name, String group, Course course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>();
        for (Integer m:marks){
            if (m>1 && m<6){
                this.marks.add(m);}
        }
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
