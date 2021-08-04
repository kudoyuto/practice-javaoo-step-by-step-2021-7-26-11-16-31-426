package practice07;

import java.util.List;

//
//        The `klass` attribute is an `Object` which has `number` and `leader` attribute.
//        But the `leader` attribute is `not` in the constructor.
public class Klass {
    private Integer number;
    private Student leader;


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

    public Student assignLeader(Student student) {
        return this.leader = student;
    }
}
