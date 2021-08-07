package practice09;


import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> students= new ArrayList<>();
    private String displayName;


    public Klass(int number) {
        this.number=number;

    }

    public Integer getNumber(){
        return number;
    }

    public String getDisplayName() {

        displayName= "Class "+ this.number;
        return displayName;
    }


    public Student getLeader() {
        return leader;
    }



    public void assignLeader(Student student) {
        if(students.contains(student)){
            this.leader = student;

        }
        System.out.print("It is not one of us.\n");


    }

    public void appendMember(Student student) {
        students.add(student);
    }
    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }



}
