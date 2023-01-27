package ch.yannickhohler.depa.template_method.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverageWithHook {

    @Override public void brew() {
        System.out.println("Lasse Kaffee durch den Filter laufen");
    }

    @Override public void addCondiments() {
        System.out.println("Füge Milch und Zucker hinzu");
    }

    @Override public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("j");
    }

    private static String getUserInput() {
        String answer = null;
        System.out.print("Nehmen Sie Milch und Zucker in Ihren Kaffee (j/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO-Fehler beim Versuch, die Antwort zu lesen");
        }
        if (answer == null) {
            return "nein";
        }
        return answer;
    }

}
