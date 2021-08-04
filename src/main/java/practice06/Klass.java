package practice06;

import java.text.MessageFormat;

public class Klass {
    private Integer number;
    public Klass (int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }


    public String getDisplayName() {
        return MessageFormat.format(("Class {0}"),this.number);
    }
}
