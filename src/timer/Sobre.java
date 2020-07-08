package timer;

import javax.swing.*;
import java.awt.*;

public class Sobre extends JFrame {
    Sobre() {
        super("Sobre");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 110);
        setResizable(false);

        JLabel aboutInfo = new JLabel("<html><p>Timer</p><p>Developed by Rafael Santos, rafaelsantos713@gmail.com</p><p>Version 1.0 (June 20th, 2020)</p></html>");
        add(aboutInfo);
    }
}
