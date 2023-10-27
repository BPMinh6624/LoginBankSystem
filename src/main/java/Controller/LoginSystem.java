/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithms;
import View.Menu;
import java.util.Locale;


/**
 *
 * @author tuanh
 */
public class LoginSystem extends Menu<String> {

    static String[] mc = {"Vietnamese", "English","Exit"};
    protected Algorithms al;
    
    public LoginSystem() {
        super("-----LOGIN PROGRAM-----", mc);
        al = new Algorithms();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                al.login(al.setLocate("vi"));
                break;
            case 2:
                al.login(al.setLocate("en"));
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
