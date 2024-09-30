package modell;

import java.util.Scanner;

public class Jatek {

    private static final Scanner sc = new Scanner(System.in);
    private Lada[] ladak;
    private int valasztas;

    public Jatek() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset!");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik!");

        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
    }

    public String kezdes() {
        String s = "";
        s += "Hol a kincs ? Csak az egyik felirat igaz!\n";
        int i = 1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". " + a + "láda --> " + f + "\n";
        }
        return s;
    }

    private void bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3): ");
        valasztas = sc.nextInt() - 1;

    }

    public void megjelenit(String s) {
        System.out.print(s);
    }

    private String ellenorzes() {
        String talalt = "Gratulálok, eltaláltad!\n";
        String nemTalalt = "Sajnos nem talált!\n";
        return ladak[valasztas].isKincs() ? talalt : nemTalalt;
    }
}
