package kart.rank;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import kart.rank.view.CorridaView;

/**
 *
 * @author Felipe
 */
public class KartRank {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        CorridaView view = new CorridaView();
        File htmlFile = view.montarResultadoCorrida();
        
        try {
              Desktop desktop = Desktop.getDesktop();
              if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File(htmlFile.toURI()));
           } else {
                System.out.println("Open is not supported");
             }
           } catch (IOException exp) {
             exp.printStackTrace();
        }
    }
    
}
