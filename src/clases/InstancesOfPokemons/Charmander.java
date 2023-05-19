package clases.InstancesOfPokemons;
import clases.Pokemon;
import interfaces.IFire;

public class Charmander extends Pokemon implements IFire{

    public Charmander(){

    }
    
    @Override
    public void toAttackFlamethrower(){
        System.out.println("Hi Im Charmander and Im using Flamethrower");
    }
    @Override
    public void toAttackFusionFlare(){
        System.out.println("Hi Im Charmander and Im using Fusion Flare");
    }
    @Override
    public void toAttackHeatCrash(){
        System.out.println("Hi Im Charmander and Im using HeatCrash");
    }
    @Override
    public void toAttackFireFang(){
        System.out.println("Hi Im Charmander and Im using Flamethrower form Interface");
    }
    public void toAttackBurnUp(){
        System.out.println("Hi Im Charmander and Im using HeatCrashfrom an interface. ");
    }
    public void toAttackSearingShot(){
        System.out.println("Hi Im Charmander and Im using FusionFlarefrom an instance ");
    }

}