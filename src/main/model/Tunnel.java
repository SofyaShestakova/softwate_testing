package main.model;

public class Tunnel {
    static String destination;


    public static String checkLocation(double x_coordinate, double y_coordinate) throws NullPointerException {
        if ((x_coordinate < 0 && y_coordinate < 0) || (x_coordinate < 0 && y_coordinate > 0)) {
            destination = "left";
        } else if ((x_coordinate > 0 && y_coordinate > 0) || (x_coordinate > 0 && y_coordinate < 0)) {
            destination = "right";
        } else if (x_coordinate == 0 && y_coordinate == 0) {
            destination = "zero";
        } else if (x_coordinate == 0 && y_coordinate != 0) {
            destination = "OY";
        } else if (x_coordinate != 0 && y_coordinate == 0 ) {
            destination = "OX";
        } else {
            throw new NumberFormatException("Невозможно определить локацию");
        }
        return destination;

    }
}
