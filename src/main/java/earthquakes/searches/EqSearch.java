package earthquakes.searches;

public class EqSearch{
    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;

    public int getDistance(){return this.distance;}
    public int getMinmag(){return this.minmag;}
    public double getLat(){return this.lat;}
    public double getLon(){return this.lon;}
    public String getLocation(){return this.location;}

    public void setDistance(int a){this.distance = a;}
    public void setMinmag(int a){this.minmag = a;}
    public void setLat(double a){this.lat = a;}
    public void setLon(double a){this.lon = a;}
    public void setLocation(String a){this.location = a;}
}
    
