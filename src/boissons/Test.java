package boissons;

import Decorateur.Caramel;
import Decorateur.Chocolat;
import Decorateur.Lipton;

public class Test {
    public static void main(String[] args){
        Boisson b=new Espresso();
        System.out.println("***********************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("***********************************");
         b=new Chocolat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("***********************************");
        b=new Lipton(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("***********************************");
        b=new Caramel( b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
    }
}
