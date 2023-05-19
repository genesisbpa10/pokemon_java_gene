package clases.InstancesOfPokemons;

import clases.Pokemon;
import interfaces.IWater;

public class Squirtle extends Pokemon implements IWater {
    public Squirtle(){
        
    }
    @Override
    protected void toAttackFlamethrower() {
        System.out.println("Im Squirtle and Im using Flamethrower attack.");
    }

    @Override
    protected void toAttackFusionFlare() {
        System.out.println("Im Squirtle and Im using Fussion Flare attack.");

    }

    @Override
    protected void toAttackHeatCrash() {
        System.out.println("Im Squirtle and Im using Heat Crash attack.");
    }

    @Override
    public void toAttackHydrobomb() {
        System.out.println("Im Squirtle and Im using Heat Crash attack.");

    }

    @Override
    public void toAttackBubble() {
        System.out.println("Im Squirtle and Im using Heat Crash attack.");

    }

    @Override
    public void toAttackWaterGun() {
        System.out.println("Im Squirtle and Im using Heat Crash attack.");

    }

}
