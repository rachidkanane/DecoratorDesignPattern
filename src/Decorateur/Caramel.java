package Decorateur;

import boissons.Boisson;

public class Caramel extends DecorateurAbstrait {

    public Caramel(Boisson boisson){
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9 + boisson.cout() ;
    }

    @Override
    public String getDescription() {
          return boisson.getDescription()+"Au Caramel ";
    }
}
