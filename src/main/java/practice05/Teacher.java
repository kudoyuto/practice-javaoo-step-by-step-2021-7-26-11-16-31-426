package practice05;

import java.text.MessageFormat;

public class Teacher extends Person {
    private Integer klass;
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if(this.klass!=null) {
            return super.introduce() + MessageFormat.format((" I am a Teacher. I teach Class {2}."),getName(),getAge(),klass);
        }else {
            return super.introduce() + MessageFormat.format((" I am a Teacher. I teach No Class."),getName(),getAge());
        }
    }
}
