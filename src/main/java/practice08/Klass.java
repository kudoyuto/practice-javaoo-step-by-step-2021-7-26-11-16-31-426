package practice08;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> leaders = new ArrayList<>();


    public Klass(int number) {
        this.number=number;
    }
    public Integer getNumber(){
        return number;
    }

    public String getDisplayName() {
        return "Class "+ this.number;
    }


    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if(leaders.contains(student)){
            this.leader = student;

        }else {
             System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student jerry) {
        this.leaders.add((jerry));
    }


}
