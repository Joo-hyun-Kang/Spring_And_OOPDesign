public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinate coordinates;

    protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
        this.id = p_id;
        this.name = p_name;
        this.coordinate = p_coordinate;
    }
}
