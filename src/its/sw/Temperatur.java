package its.sw;

/**
 *
 * @author Oliver Schwahlen Angepasst am 20.05.2022 von @author Erhard Volz
 */
public class Temperatur {

    public static final String PROP_TEMPERATUR = "temperatur";

    private double temperatur = 0.0; // Celsiustemperatur

    /**
     * @return the temperatur in °C
     */
    public double getCelsius() {
        return temperatur;
    }

    /**
     * @return the temperatur in °F
     */
    public double getFahrenheit() {
        return ((temperatur * 9) / 5) + 32;
    }

    /**
     * Nimmt die Temperatur in °C entgegen und setzt sie. Sie soll bei 
     * angemeldeten Observern ein PropertyChange Ereignis auslösen.
     * @param temperatur the temperatur in °C to set
     */
    public void setCelsius(double temperatur) {
        this.temperatur = temperatur;
    }

    /**
     * Nimmt die Temperatur in Fahrenheit entgegen Sie wandelt sie in °C um
     * und setzt sie unter Verwendung der eigenen Methode setCelsius(..).
     * Dabei wird ein PropertyChange Ereignis ausgelöst.
     * @param temperatur the temperatur in °F to set
     * @see Temperatur#setCelsius(double) 
     */
    public void setFahrenheit(double temperatur) {
        double tempF = (temperatur - 32) * 5 / 9;
        this.setCelsius(tempF);
    }
 
    /**
     * Gibt ein kopiertes Objekt der eigenen Klasse zurück.
     *
     * @return a clone
     */
    @Override
    protected Temperatur clone() throws CloneNotSupportedException {
        Temperatur clone = (Temperatur)super.clone();
        clone.temperatur = this.temperatur;
        return clone;
    }
    
}
