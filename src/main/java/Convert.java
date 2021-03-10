public class Convert {

    public static double convertLengthFromCentToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double convertLength(double length, String unit) {
        if (unit.equalsIgnoreCase("inches")) {
                //this returns centimeters
                return (length * 2.54);
            }else if (unit.equalsIgnoreCase("centimeters")) {
                //this returns inches
                return (length / 2.54);
            }
            return 0;
    }
}

