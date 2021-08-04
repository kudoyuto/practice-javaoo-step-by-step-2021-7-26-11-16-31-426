package practice08;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;

    }
    public Klass getKlass() {
        return this.klass;
    }
    public String introduce(){
        if (this.equals(klass.getLeader())){
            return String.format("My name is %s. I am %d years old. I am a Student. I am Leader of Class %d.",getName(),getAge(),klass.getNumber());
        }else {
            return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.",getName(),getAge(),klass.getNumber());
        }
    }
}
