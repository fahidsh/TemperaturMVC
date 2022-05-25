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
    private Temperatur temperatur = new Temperatur();

    
 
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
        // Objekte von alle drei Gui-Klassen erstellen
        CelsiusGUI celsiusGUI = new CelsiusGUI(this);
        FahrenheitGUI fahrenheitGUI = new FahrenheitGUI(this);
        ThermometerGUI thermometerGUI = new ThermometerGUI(this);
        
        // alle Gui-Objekten als Beobachter der Tempratur hinzufügen
        temperatur.addObserver(celsiusGUI);
        temperatur.addObserver(fahrenheitGUI);
        temperatur.addObserver(thermometerGUI);
        
        // Position für Gui-Objekte (wie Aleitung) setzen
        celsiusGUI.setLocation(AUFTAUCHPUNKT_GUIS, AUFTAUCHPUNKT_GUIS);
        fahrenheitGUI.setLocation(
                AUFTAUCHPUNKT_GUIS, 
                AUFTAUCHPUNKT_GUIS + celsiusGUI.getHeight() + ABSTAND_ZWISCHEN_GUIS);
        thermometerGUI.setLocation(
                AUFTAUCHPUNKT_GUIS + celsiusGUI.getWidth() + ABSTAND_ZWISCHEN_GUIS, 
                AUFTAUCHPUNKT_GUIS);
        
        // Gui-Objekte Sichtbar machen
        celsiusGUI.setVisible(true);
        fahrenheitGUI.setVisible(true);
        thermometerGUI.setVisible(true);
        
        // Anfangstempratur auf '0' setzen
        temperatur.setCelsius(0);
    }



}
