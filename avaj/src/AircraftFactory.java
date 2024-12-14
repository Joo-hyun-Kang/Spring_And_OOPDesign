import flyable.aircraft.Coordinates;
import flyable.Flyable;

public class AircraftFactory {
    //staticフィールドはクラスロード時に1度だけメモリに読み込まれるため、グローバルな1つのインスタンスを保証します。
    //いつメモリに載せる？　メモリはデータ領域に載せるか？
    private static AircraftFactory aircraftFactory;

    //singleton class
    private AircraftFactory() {};

    //マルチタスクに対応なし

    public AircraftFactory getInstance() {
        if (aircraftFactory == null) {
            aircraftFactory =  new AircraftFactory();
        }

        return aircraftFactory;
    }

    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        assert false;
        return null;
    }
}
