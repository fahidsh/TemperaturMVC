package its.sw;

/**
 *
 * @author Oliver Schwahlen
 * Angepasst am 20.05.2022 von @author Erhard Volz
 */
public class Controller {

    public static final int AUFTAUCHPUNKT_GUIS = 100; // Pixel
    public static final int ABSTAND_ZWISCHEN_GUIS=30;
    
    // Hier ein privates Attribut der Klasse Temperatur erstellen

    
 
    /**
     * Initialisiert alle Attribute.
     * <ul>
     * <li>Erstellt ein Objekt der Klasse CelsiusGui als Attribut.</li>
     * <li>Fügt die CelsiusGUI der Temperatur als Beobachter hinzu.</li>
     * <li>Macht die CelsiusGUI sichtbar und setzt den Auftauchpunkt mit
     * .setLocation(AUFTAUCHPUNKT_GUIS,AUFTAUCHPUNKT_GUIS)</li>
     * <li>Erstellt ein Objekt der Klasse FahrenheitGui als Attribut.</li>
     * <li>Fügt die FahrenheitGUI der Temperatur als Beobachter hinzu.</li>
     * <li>Macht die FahrenheitGUI sichtbar und setzt den Auftauchpunkt mit
     * .setLocation(..) mit ABSTAND_ZWISCHEN_GUIS unter die CelsiusGUI</li>
     * <li>Erstellt ein Objekt der Klasse ThermometerGUI als Attribut.</li>
     * <li>Fügt die ThermometerGUI der Temperatur als Beobachter hinzu.</li>
     * <li>Macht die ThermometerGUI sichtbar und setzt den Auftauchpunkt mit
     * .setLocation(..) mit ABSTAND_ZWISCHEN_GUIS neben die CelsiusGUI</li>
     * <li>Setzt die Temperatur in Celsius auf 0° </li>
     * </ul>
     */
    void init() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
