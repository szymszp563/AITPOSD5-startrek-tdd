package utils;

public class CityBlockDistance {
    public double getCityBlockDistance(double x1, double y1, double x2, double y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

}
