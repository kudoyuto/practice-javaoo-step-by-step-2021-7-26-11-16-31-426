package practice09;

import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<Klass>();
    public Teacher(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age, LinkedList linkedList){
        super(id,name,age);
        this.linkedList = linkedList;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return this.linkedList.size()!=0?String.format("%s I am a Teacher. I teach Class %s.",super.introduce(),linkedList):
                String.format("%s I am a Teacher. I teach No Class.",super.introduce());
    }
    public String introduceWith(Student student) {

            if(klass.getNumber() == student.getKlass().getNumber()) {
                return String.format("%s I am a Teacher. I Teach %s.",super.introduce(),student.getName());
            } else {
                return String.format("%s I am a Teacher. I don'tTeach %s.",super.introduce(),student.getName());
            }
        }
    public boolean isTeaching(Student student){
        return true;
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }


//    Teacher also has an `isTeaching` method, which accepts an instance of `Student`
//    and return `true/false`.
//    As long as the student is in any `klass` of the `classes`, the teacher is teaching him.
//    Whether the student is in klass, `Klass` has a method `isIn` to judge.



}



