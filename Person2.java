import java.util.Scanner;

public class Person2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        abstract class Person{

           private String vorname;
           private String nachname;
        }

        class student extends Person{

            private String universität;
            private  String studienfach;
            private int matrikelNr;
        }

        class Schueler extends Person {

            private String schule;
            private String klasse;
            private int katalogNr;
        }

        String eingabe = "";
        String student = "";
        String schueler = "";
        String vorname = "";
        String nachname = "";

        String [] personenliste1 =  new String[100];
        String [] personenliste2 = new String[100];


        for (int i = 0; i < 10; i++) {
            System.out.print("Student oder Schüler?: ");
            eingabe = scanner.next();
            System.out.print("Vorname: ");
            vorname = scanner.next();
            System.out.print("Nachname: ");
            nachname = scanner.next();

            if (eingabe.equals("Student") || eingabe.equals("student")){
                personenliste1[i] = eingabe;
                System.out.println(personenliste1[i]+ " "+vorname+" "+nachname);
            } else {
                personenliste2[i] = eingabe;
                System.out.println(personenliste2[i] +" "+vorname+" "+ nachname);
            }
        }
    }
}
