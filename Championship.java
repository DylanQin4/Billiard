package objectDB;

public class Championship {
    int idChampionship;
    int years;
    
    public Championship(){};
    
    public Championship(int idChampionship, int years) {
        setIdChampionship(idChampionship);
        setYears(years);
    }

    public int getIdChampionship() {
        return idChampionship;
    }
    public void setIdChampionship(int idChampionship) {
        this.idChampionship = idChampionship;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
}
