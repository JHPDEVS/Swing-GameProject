/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Register.Register;
import Splash.SplashScreen;
import Login.Login;
/**
 *
 * @author 박주형
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen SplashScreen = new SplashScreen();
        SplashScreen.setVisible(true);
        try {
            for (int i=0; i<=100;i++) {
                Thread.sleep(5);
                SplashScreen.loadingNum.setText((Integer.toString(i)+"%"));
                SplashScreen.loadingBar.setValue(i);
                if(i==100) {
                    SplashScreen.setVisible(false);
                 //   Register Register = new Register();
                    new Login().setVisible(true);
                  //  new Register().setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
