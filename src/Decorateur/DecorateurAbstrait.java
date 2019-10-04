package Decorateur;

import boissons.Boisson;

public abstract  class DecorateurAbstrait extends Boisson{
    protected Boisson boisson;

     public DecorateurAbstrait(Boisson boisson){
         super();
         this.boisson = boisson ;
     }

     public abstract String getDescription();

}
