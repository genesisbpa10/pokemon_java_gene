import clases.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        Pokemon pokemon1 = new Pokemon(1, "Pikachu", 6, 1);

        System.out.println("This is the pokemon N°"+pokemon1.getNPokedexNumberPokemon()+" . Its name is "+ pokemon1.getNamePokemon()+" , its weight is "+pokemon1.getWeightPokemon()+" kgs and it appeared for the first time in season "+pokemon1.getSeasonPokemon()+".");
    }
}
