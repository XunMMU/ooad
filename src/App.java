package src;

import javax.swing.SwingUtilities;
import src.ui.MainPage;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainPage frame = new MainPage();
            frame.setVisible(true);
        });
    }
}
