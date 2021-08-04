package practice07;
//Write another `Teacher` class which extends the `Person` class.
//        In addition to the `id`, `name`, and `age` attributes,
//        it also has `Klass` attribute, and an `introduce` method,
//        The `introduce` method should return a string when the `Klass` is not null:
//
//        >My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
//
//        If the `Klass` is null, it should return：
//
//        >My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }public Teacher(int id, String name, int age) {
        super(id, name, age);

    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        if(klass!=null){
            return String.format("%s I am a Teacher. I teach Class %d.",super.introduce(),klass.getNumber());
        }else {
            return String.format("%s I am a Teacher. I teach No Class.",super.introduce());
        }
    }

    public String introduceWith(Student student) {
        if(getKlass().getNumber() == student.getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach "+ student.getName()+".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach "+ student.getName()+".";
        }
    }

}
