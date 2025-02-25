import boissons.Boisson;
import boissons.Expresso;
import boissons.Sumatra;
import deco.Chantilly;
import deco.Chocolat;
import deco.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;

        boisson = new Sumatra();
        System.out.println(boisson.getDescription() + " - " + boisson.cout()+ " F CFA");

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " - " + boisson.cout()+ " F CFA");

        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription() + " - " + boisson.cout()+ " F CFA");

        boisson = new Chantilly(boisson);
        System.out.println(boisson.getDescription() + " - " + boisson.cout()+ " F CFA");

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " - " + boisson.cout()+ " F CFA");

    }
}