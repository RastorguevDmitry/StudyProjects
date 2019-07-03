package JavaIO.HomeTask;

import java.io.Serializable;

public class TelephonNumber implements Serializable {

    String number;
    String name;

    public TelephonNumber(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(number + " " + name);
    }


}
