
public class Country {

    private String countryName;
    private int population;
    private int area;
    private String nameOfTheCapital;
    private boolean exitToTheSea;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setNameOfTheCapital(String nameOfTheCapital) {
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public boolean isExitToTheSea() {
        return exitToTheSea;
    }

    public void setExitToTheSea(boolean exitToTheSea) {
        this.exitToTheSea = exitToTheSea;
    }
}
