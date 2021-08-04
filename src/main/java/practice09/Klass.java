package practice09;

import java.util.ArrayList;
import java.util.List;

//3. When you build an instance of `Student` you need pass
//        the `Klass` instance to the constructor of `Student`.
//        You can find more details in the test case.
//        The `Klass` has an `assignLeader` method, which will take an instance of `Student` as parameter.
//        It means setting that student as the leader of the `Klass`.
//        If the leader of `Klass` is Tom, then Tom calls the `introduce`
////        method should return:
////
////        >My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
////
////        If Tom is not the leader, just return the old strings:
////
////        >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> leaders = new ArrayList<>();
    public Klass(int number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
    public void assignLeader(Student student){
        if(leaders.contains(student)){
            this.leader = student;
        }else {
        System.out.print("It is not one of us.\n");
         }

    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d",this.number);
    }
//    `Klass` has an `appendMember` method that accepts an instance of `Student` as parameter.
//    This means adding a student to the school class.
//    If the student does not join the class, when we call the `assignLeader` method,
//    the assignment will not succeed. The `assignLeader` method need to print the following sentence:
//
//            >It is not one of us.
    public void appendMember(Student student){
        this.leaders.add(student);

    }
}
