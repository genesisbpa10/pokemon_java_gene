import clases.InstancesOfPokemons.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Hi, we are building this. Go ahead and play pokemon meanwhile we conitnue working. When this is done, we will be back.");
        Pikachu pikapika = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Bulbasur bulbasur = new Bulbasur();
        Charmander charmander = new Charmander();

        pikapika.setNamePokemon("Pika1");
        squirtle.setNamePokemon("Squirtle1");
        charmander.setNamePokemon("Charmander1");
        bulbasur.setNamePokemon("Bulbasur1");

        System.out.println(pikapika.getNamePokemon());
        System.out.println(squirtle.getNamePokemon());
        System.out.println(bulbasur.getNamePokemon());
        System.out.println(charmander.getNamePokemon());

        //Implementing the methods for pikapika
        pikapika.toAttackQuash();
        pikapika.toAttackFusionFlare();

        //Implementing the methods for squirtle
        squirtle.toAttackBubble();
        squirtle.toAttackFusionFlare();

        //Implementing the methods for charmander
        charmander.toAttackBurnUp();
        charmander.toAttackFusionFlare();

        //Implementing the methods for bulbasur
        bulbasur.toAttackCottonSpore();
        bulbasur.toAttackFusionFlare();
        
    }}
