package pl.krakow.uek.student.paryla;

import java.util.Collections;

public class Creditcard {
    public static void main(String[] args) {
        var name = "Krystian";
        var message = String.format("Witaj, %s, przyjacielu",name);
        var names = Collections.singletonList("Krystian Paryła");
        System.out.println(message);
    }
}
