package gui;

import javax.swing.*;

public class TipperController {

    private TipperModell tm = new TipperModell();

    public String readJTextField(JTextField jtf) {
        return jtf.getText().toString();
    }

    public boolean textFieldChecker(JTextField jtf) {
        String str = readJTextField(jtf);
        if (str.length() == 0) {
            JOptionPane.showMessageDialog(null,"Nincs beirva semmi", "Hibaüzenet", 0);
            return false;
        } else if (goodInt(str)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A beirt adat nem alakithato egesz szamma", "Hibaüzenet", 0);
            return false;
        }
    }

    public boolean goodInt(String input) {
        try {
            int num = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    public void reset(JTextField a, JTextField b) {
        tm.reset();
        a.setText("");
        b.setText("");
    }

    public void tipp(JTextField jtf, JTextField info) {
        int num = Integer.parseInt(jtf.getText());
        if (tm.talalt(num)) {
            JOptionPane.showMessageDialog(null, "Grat, eltalaltad a szamot", "Nyertél", 0);
            return;
        } else
            info.setText("Nem jó a szám");
    }
}
