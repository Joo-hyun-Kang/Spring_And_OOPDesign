import flyable.aircraft.Coordinates;
import flyable.Flyable;

public class AircraftFactory {
    //staticクラスの関数はCの関数ようにメモリにはそれが呼ばれた時に載せる
    //  -staticクラスの存在理由：インスタンスを作りたくない場合、Cように関数を作りたい
    //static変数はどちらにあればいい？結局全域（全域変数）
    private static AircraftFactory aircraftFactory;

    //singleton class
    private AircraftFactory() {};

    //マルチタスクに対応なし
    public static AircraftFactory getInstance() {
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
