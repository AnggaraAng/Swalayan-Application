
package MAIN;

import view.admin;
import view.login;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

    public static void main(String[] args){
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login l = new login();
                l.setVisible(true);
                
            }
        });
    }
    
}
