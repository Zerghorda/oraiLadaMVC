package nezet;

import java.util.Scanner;

public class KonzolNezet {

    private static final Scanner sc = new Scanner(System.in);

    public void megjelenit(String s) {
        System.out.print(s);
    }

    public int bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3): ");
        return sc.nextInt() - 1;
    }
}
