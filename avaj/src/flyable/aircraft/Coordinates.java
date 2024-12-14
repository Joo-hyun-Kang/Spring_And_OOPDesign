package flyable.aircraft;

public class Coordinates {
    //座標（ざひょう）
    private int longitude;
    private int latitute;
    private int height;

    //~package
    Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.longitude = p_longitude;
        this.latitute = p_latitude;
        this.height = p_height;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public int getLatitute() {
        return this.latitute;
    }

    public int getHeight() {
        return this.height;
    }
}
