package clases.InstancesOfPokemons;

import clases.Pokemon;
import interfaces.IGrass;

public class Bulbasur extends Pokemon implements IGrass {
    public Bulbasur (){

    }
    @Override
    protected void toAttackFlamethrower() {
        System.out.println("Im Bulbasur and Im using Flamethrower attack.");
    }

    @Override
    protected void toAttackFusionFlare() {
        System.out.println("Im Bulbasur and Im using Fussion Flare attack.");

    }

    @Override
    protected void toAttackHeatCrash() {
        System.out.println("Im Bulbasur and Im using Heat Crash attack.");
    }

    @Override
    public void toAttackStrengthSap() {

        System.out.println("Im Bulbasur and Im using Heat Crash attack.");
    }

    @Override
    public void toAttackCottonSpore() {

        System.out.println("Im Bulbasur and Im using Heat Crash attack.");
    }
}
