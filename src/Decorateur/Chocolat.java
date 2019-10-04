package Decorateur;

import boissons.Boisson;

public class Chocolat extends DecorateurAbstrait {

    public Chocolat(Boisson boisson){
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.7 + boisson.cout() ;
    }

    @Override
    public String getDescription() {
          return boisson.getDescription()+"Au chocolat ";
    }
}
