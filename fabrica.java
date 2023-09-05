import java.util.Scanner;

public class fabrica {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o custo da fabrica: ");
        double fab= scan.nextDouble();

        double dist;
        double imposto;

        if (fab <=12000){
        dist=fab+(fab*0.05);
        imposto=0;
            System.out.println("valor do distribuidor: "+dist);
            System.out.println("sem imposto");
        } else if (fab>12000 && fab<=25000) {
            dist=fab+(fab*0.10);
            imposto=fab+(fab*0.15);
            System.out.println("valor do distribuidor: "+dist);
            System.out.println("valor do imposto: "+imposto);
        } else if (fab>25000) {
            dist=fab+(fab*0.15);
            imposto=fab+(fab*0.20);
            System.out.println("valor do distribuidor: "+dist);
            System.out.println("valor do imposto: "+imposto);
        }
    }
}
