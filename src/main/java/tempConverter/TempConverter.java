package tempConverter;

public class TempConverter {

    String convertUnit;
    String convertAbbrev;

    public TempConverter() {
        convertUnit = "";
    }

    void main(String[] args) {
        try {
            final String originalTemp = "gahjftyrrtsd";
            String convertedTemp = convertTemp(originalTemp) + convertAbbrev;
            System.out.println(originalTemp + " converted to " + this.convertUnit + " is " + convertedTemp);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public double convertTemp(String temperature) {
        double valueOfTemp = 0;
        if (temperature.matches(".*[Ff].*")) {
            this.convertUnit = "Celsius";
            this.convertAbbrev = "C";
            valueOfTemp = Double.parseDouble(temperature.replaceAll("[Ff]", ""));
            return fahrenheitToCelsius(valueOfTemp);
        } else if (temperature.matches(".*[Cc].*")) {
            this.convertUnit = "Fahrenheit";
            this.convertAbbrev = "F";
            valueOfTemp = Double.parseDouble(temperature.replaceAll("[Cc]", ""));
            return celsiusToFahrenheit(valueOfTemp);
        } else {
            throw new IllegalArgumentException("Please enter a number followed by F or C to indicate the unit.");
        }
    }

    protected static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)/9 * 5;
    }
    protected static double celsiusToFahrenheit(double celcius) {
        return (celcius * 1.8) + 32;
    }
}
