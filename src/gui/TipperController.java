package gui;

import javax.swing.*;

public class TipperController {

    private TipperModell tm = new TipperModell();

    //reads a JTextField into a String
    public String readJTextField(JTextField jtf) {
        return jtf.getText().toString();
    }

    //checks if a JTF has a valid number in it
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

    //checks if the String input can be parsed into an integer
    public boolean goodInt(String input) {
        try {
            int num = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //converts string to int
    public int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    public void reset(JTextField a, JTextField b) {
        tm.reset();
        a.setText("");
        b.setText("");
        JOptionPane.showMessageDialog(null, "Új szám generálva!", "Új játék", 1);
    }

    //basic logic to check if the entered number is equal to the generated random number
    public void tipp(JTextField jtf, JTextField info) {
        int num = Integer.parseInt(jtf.getText());

        if(num > 100) {
            info.setText("A beírt szám túl nagy");
            return;
        }
        else if(num < 1) {
            info.setText("A beírt szám túl kicsi");
            return;
        }

        if (tm.getRandomNum() < num)
            info.setText("Kisebbet tippelj!");
         else if(tm.getRandomNum() > num)
            info.setText("Nagyobbat tippelj!");
        else {
                JOptionPane.showMessageDialog(null, "Grat, eltalaltad a szamot", "Nyertél", JOptionPane.PLAIN_MESSAGE);
                return;
        }
    }
}
