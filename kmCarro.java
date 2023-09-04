import java.util.Scanner;

public class kmCarro {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a distancia em km: ");
        float km= scan.nextFloat();

        System.out.println("digite a quantidade de gasolida consumida pelo carro:  ");
        float consumo= scan.nextFloat();

        float kml= km/consumo;
        System.out.println("Consumo: "+kml+" km/l");

        if (kml<8){
            System.out.println("VENDA O CARRO");
        } else if (kml>=8 && kml<=14) {
            System.out.println("ECONOMICO");
        } else if (kml>12) {
            System.out.println("SUPER ECONOMICO");
        }else {
            System.out.println("INVALIDO");
        }
    }
}
