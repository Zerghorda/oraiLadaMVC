package vezerlo;

import modell.JatekModell;
import nezet.FelUgroNezet;

public class FelUgroVezerlo {

    private JatekModell modell;
    private FelUgroNezet nezet;

    public FelUgroVezerlo(JatekModell modell, FelUgroNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;

        start();
        modell.ellenorzes();
    }

    public void start() {
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());

    }

}
