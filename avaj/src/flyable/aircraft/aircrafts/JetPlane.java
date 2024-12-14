package flyable.aircraft.aircrafts;

import flyable.aircraft.Aircraft;
import flyable.aircraft.Coordinates;

public class JetPlane extends Aircraft {
    protected JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    @Override
    public void updateConditions() {
        assert false;
    }
}
