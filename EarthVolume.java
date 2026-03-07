class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.141592653589793;
        double conversionFactor = 1.6;

        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / conversionFactor;
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);
    }
}

