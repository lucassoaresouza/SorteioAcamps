package sorteioacamps;

import java.awt.EventQueue;
import java.util.ArrayList;
import static sorteioacamps.FileHandler.createFile;
import static sorteioacamps.FileHandler.readFile;
import static sorteioacamps.FileHandler.writeFile;

/**
 *
 * @author Lucas
 */
public class SorteioAcamps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainMenu tela_inicial = new MainMenu();
                tela_inicial.setVisible(true);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
