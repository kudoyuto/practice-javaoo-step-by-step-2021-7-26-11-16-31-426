package practice09;
//Write another `Student` class which inherit from the `Person` class.
//        Besides `id`, `name` and `age` attributes, the `Student` class also should have `klass` attributes.
//        There is also an `introduce` method,
//        The `introduce` method returns a string like:
//
//        >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
//
//        The `klass` attribute is an `Object` which has `number` and `leader` attribute.
        //But the `leader` attribute is `not` in the constructor.


//If the leader of `Klass` is Tom, then Tom calls the `introduce`
//        >My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
//        If Tom is not the leader, just return the old strings:
//
//        >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
public class Student extends Person {
        private Klass klass;
        public Student (int id, String name, int age,Klass klass) {
            super(id,name,age);
            this.klass = klass;
        }
        @Override
        public String introduce(){
            if(this.equals(klass.getLeader())) {
                return String.format("%s I am a Student. I am Leader of Class %d.",super.introduce(),klass.getNumber());
            }else {
                return String.format("%s I am a Student. I am at Class %d.",super.introduce(),klass.getNumber());
            }

        }
        public Klass getKlass(){
            return this.klass;
        }
}
