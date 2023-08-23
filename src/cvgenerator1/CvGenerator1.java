/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cvgenerator1;

/**
 *
 * @author Dell
 */
public class CvGenerator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Heloo world");
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        DbConnection conn = new DbConnection();
        conn.connectDb();
    }
    
}
