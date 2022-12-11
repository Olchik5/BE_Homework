package _12_12_22_map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Guest {
    String name;
    String surname;
    int age;

    public Guest(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
