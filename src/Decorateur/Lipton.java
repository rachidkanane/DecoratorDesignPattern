package Decorateur;

import boissons.Boisson;

public class Lipton extends DecorateurAbstrait {

    public Lipton(Boisson boisson){
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.0 + boisson.cout() ;
    }

    @Override
    public String getDescription() {
          return boisson.getDescription()+"Au Lipton ";
    }
}
