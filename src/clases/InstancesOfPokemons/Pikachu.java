package clases.InstancesOfPokemons;

import clases.Pokemon;
import interfaces.IElectric;

public class Pikachu extends Pokemon implements IElectric {

    public Pikachu(){
        
    }
    @Override
    protected void toAttackFlamethrower() {
        System.out.println("Im Pikachu and Im using Flamethrower attack.");
    }

    @Override
    protected void toAttackFusionFlare() {
        System.out.println("Im Pikachu and Im using Fussion Flare attack.");

    }

    @Override
    protected void toAttackHeatCrash() {
        System.out.println("Im Pikachu and Im using Heat Crash attack.");
    }

    @Override
    public void toAttackQuash() {
        System.out.println("Hi Im Pikachu and Im using Attack Squash from an Interface.");
    }

    public void toAttackBreakingSwipe() {
        System.out.println("Hi Im Pikachu and Im using  Attack Breaking Swipe from an Interface.");

    }

    public void toAttackFissure() {
        System.out.println("Hi Im Pikachu and Im using Attack Fissure from an Interface.");

    }
}
