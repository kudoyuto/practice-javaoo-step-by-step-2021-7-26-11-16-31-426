package practice04;

import java.text.MessageFormat;

public class Student extends Person{
    private int klass;
    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }
    @Override
    public String introduce() {
        return super.introduce() + MessageFormat.format((" I am a Student. I am at Class {0}."),klass);

    }


    public int getKlass() {
        return klass;
    }
}