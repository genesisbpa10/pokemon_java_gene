package clases;

public abstract class Pokemon {
    int pokedex_num_pokemon;
    String name_pokemon;
    double weight_pokemon;
    int season_pokemon;


    protected abstract void toAttackFlamethrower();
    protected abstract void toAttackFusionFlare();
    protected abstract void toAttackHeatCrash();

    public Pokemon() {

    }

    public Pokemon(int pokedex_num_pokemon, String name_pokemon, double weight_pokemon, int season_pokemon) {

        this.pokedex_num_pokemon = pokedex_num_pokemon;
        this.name_pokemon = name_pokemon;
        this.weight_pokemon = weight_pokemon;
        this.season_pokemon = season_pokemon;
    }

    public void setPokedexNumberPokemon(int pokedex_num_pokemon) {
        this.pokedex_num_pokemon = pokedex_num_pokemon;
    }

    public int getNPokedexNumberPokemon() {
        return pokedex_num_pokemon;
    }

    public void setNamePokemon(String name_pokemon) {
        this.name_pokemon = name_pokemon;
    }

    public String getNamePokemon() {
        return name_pokemon;
    }

    public void setWeight(double weight_pokemon) {
        this.weight_pokemon = weight_pokemon;
    }

    public double getWeightPokemon() {
        return weight_pokemon;
    }

    public void setSeasonPokemon(int season_pokemon) {
        this.season_pokemon = season_pokemon;
    }
    public int getSeasonPokemon(){
        return season_pokemon;
    }



}