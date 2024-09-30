package nezet;

import javax.swing.JOptionPane;

public class FelUgroNezet extends CuiNezet{

    @Override
    public void megjelenit(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    /**
     *
     * @return
     */
    @Override
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyik ládában van a kincs? (1,2,3):");
        return Integer.parseInt(v) - 1;
    }
}
