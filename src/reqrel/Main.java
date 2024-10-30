package reqrel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        monitor monitor = new monitor();
        demander d10 = new demander(monitor, 10,"demande 10");
        demander d1 = new demander(monitor, 1,"demande 1");
        demander d2 = new demander(monitor, 2,"demande 2");
        demander d3 = new demander(monitor, 3,"demande 3");
        demander d4 = new demander(monitor, 4,  "demande 4");
        demander d5 = new demander(monitor, 5, "demande 5");
        demander d6 = new demander(monitor, 6, "demande 6");
        demander d7 = new demander(monitor, 7, "demande 7");
        demander d8 = new demander(monitor, 8,  "demande 8");
        demander d9 = new demander(monitor, 9,  "demande 9");

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        d6.start();
        d7.start();
        d8.start();
        d9.start();
        d10.start();

    }
}