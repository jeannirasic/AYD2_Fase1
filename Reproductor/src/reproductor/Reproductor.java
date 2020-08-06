/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import java.util.LinkedList;
import java.util.List;
import libraries.MusicPlayer;
import model.*;
import view.*;

/**
 *
 * @author jeann
 */
public class Reproductor {

    /**
     * @param args the command line arguments
     */
    
    public static LinkedList<Usuario> lista = new LinkedList<>();
    public static LinkedList<Song> songList = new LinkedList<>();
    public static LinkedList<Playlist> playlists = new LinkedList<>();
    public static int posicionUsuario = 0;
    public static int contadorCanciones = 0;
    public static int playListSeleccionada = 0;
    public static int contadorPlaylists = -1;
    
    //Cambios xdxd
    
    ///ssss
    
    public static void main(String args[]) {
        lista.add(new Usuario("Jeannira Sic", "jeannira","123")); //Eliminar esto despues
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
}
