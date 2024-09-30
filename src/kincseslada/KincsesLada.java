package kincseslada;

import modell.JatekModell;
import nezet.FelUgroNezet;
import nezet.KonzolNezet;
import vezerlo.FelUgroVezerlo;
import vezerlo.KonzolVezerlo;

public class KincsesLada {

    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
        // KonzolNezet nezet = new KonzolNezet();
        FelUgroNezet Fnezet = new FelUgroNezet();
        // new KonzolVezerlo(modell, nezet);
        new FelUgroVezerlo(modell, Fnezet);
    }

}
