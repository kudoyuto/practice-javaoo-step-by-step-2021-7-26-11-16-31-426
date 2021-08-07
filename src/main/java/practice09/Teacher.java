package practice09;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Teacher extends Person {

    private LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList){
        super(id,name,age);
        this.linkedList = linkedList;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public String introduce() {
        if(linkedList == null) {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",getName(),getAge());
        }
        List <String> classes = new ArrayList<>();
        for (Klass klassList:linkedList){
            classes.add(String.valueOf(klassList.getNumber()));
        }
        String classList = String.join(", ",classes);
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %s.",getName(),getAge(),classList);

    }
    public String introduceWith(Student student) {
        String message = super.introduce() + " I am a Teacher.";
        List<Klass> klasses;

        klasses = linkedList
                .stream()
                .filter(klass -> klass.getNumber() == student
                .getKlass().getNumber())
                .collect(Collectors.toList());

        if(!klasses.isEmpty()) {
            return message + (" I teach " + student.getName() + ".");
        }
        else {
            return message + (" I don't teach " + student.getName() + ".");
        }
    }
    public boolean isTeaching(Student student){
        return linkedList.contains(student.getKlass());
    }

    public LinkedList<Klass> getClasses() {
        return this.linkedList ;
    }



}



