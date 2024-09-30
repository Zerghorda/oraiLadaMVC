package kincseslada;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelUgroNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;


public class KincsesLada {

    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
        // KonzolNezet nezet = new KonzolNezet();
        // FelUgroNezet Fnezet = new FelUgroNezet();
        // new KonzolVezerlo(modell, nezet);
        CuiNezet nezet;
        //nezet = new KonzolNezet();
        nezet = new FelUgroNezet();
        new CuiVezerlo(modell, nezet);
    }

}
