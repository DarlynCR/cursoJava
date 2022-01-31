package enums;

public enum Continents {
    // Estados o atributos de cada valor constante
    //Se puede ver como un Objeto, entre "()" seguidos de "," van cuantos atributos
    //se quieran asignar

    AFRICA(23, 1256256),//Esta asignación se realiza en el mismo enum
    EUROPE(12, 1256256),
    AMERICA(23, 1256256);

    //Atributos para cada uno de los valores constantes
    private final int countries;
    private final double population;

    //Constructor que asigna los valores escritos entre "()" en cada valor constante
    //Esto se realiza internamente en el enum
    Continents(int countries, double population){
        this.countries = countries;
        this.population = population;
    }

    //GETTER para poder acceder a los valores,


    public int getCountries() {
        return countries;
    }

    public double getPopulation() {
        return population;
    }
}
