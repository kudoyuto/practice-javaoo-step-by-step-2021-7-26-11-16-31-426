package practice06;

import java.text.MessageFormat;

public class Student extends Person{
    private final Klass klass;

    public Student(String name, int age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    @Override
    public String introduce(){
        return super.introduce() + MessageFormat.format((" I am a Student. I am at {0}."),klass.getDisplayName());

    }


    public Klass getKlass() {
        return this.klass;
    }
}
