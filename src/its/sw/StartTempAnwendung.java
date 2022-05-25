/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package its.sw;

/**
 *
 * @author vo
  * Angepasst am 20.05.2022 von @author Erhard Volz
*/
public class StartTempAnwendung {

    /**
     * Startet die Anwendung, indem sie ein Controller-Objekt erstellt und die
     * Methode init() aufruft
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.init();
    }

}
