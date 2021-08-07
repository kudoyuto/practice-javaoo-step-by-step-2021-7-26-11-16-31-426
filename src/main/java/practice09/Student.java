package practice09;

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
                return String.format("%s I am a Student. I am at %s.",super.introduce(),klass.getDisplayName());
            }

        }
        public Klass getKlass(){
            return this.klass =klass;
        }
}
