package flyable;

import tower.WeatherTower;

public abstract class Flyable {
    //Uml図の#はProtectedを意味する
    protected WeatherTower weatherTower;

    //Uml図は+はpublic
    public abstract void updateConditions();

    //Uml図にはregisterTower(tower.WeatherTower* p_tower)と書いてある
    //*はポインタみたい
    public void registerTower(WeatherTower p_tower) {
        this.weatherTower = p_tower;
    }
}
