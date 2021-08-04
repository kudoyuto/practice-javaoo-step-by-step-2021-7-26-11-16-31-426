package practice06;

import java.text.MessageFormat;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name, int age){
        super(name,age);

    }
    @Override
    public String introduce() {
        if(this.klass!=null) {
            return super.introduce() + " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }



    public Klass getKlass() {
        return this.klass;
    }

    public String introduceWith(Student name) {
        if(klass.getNumber() == name.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach "+name.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach "+name.getName()+".";
        }

    }
}
