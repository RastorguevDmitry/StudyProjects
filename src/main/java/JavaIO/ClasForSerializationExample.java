package JavaIO;

import java.io.Serializable;

public class ClasForSerializationExample implements Serializable {
    static String faculty = "MMF";
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "ClasForSerializationExample{" +
                "faculty '" + faculty + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }

    public ClasForSerializationExample(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}
