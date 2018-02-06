package sorteioacamps;

import java.awt.EventQueue;

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
                Iniciar tela_inicial = new Iniciar();
                tela_inicial.setVisible(true);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    
    }
}
