import java.util.Scanner;

public class mediaAluno {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o valor de 1 a 4 pra selecionar as medias como geometrica,ponderada,harmonica e aritmetica: ");
        int num= scan.nextInt();

        System.out.println("digite um numero inteiro: ");
        double n1= scan.nextDouble();

        System.out.println("digite um numero inteiro: ");
        double n2= scan.nextDouble();

        System.out.println("digite um numero inteiro: ");
        Double n3= scan.nextDouble();

        switch (num){
            case 1:
                double geometrica= Math.cbrt(n1*n2*n3);
                System.out.println(" a media geometrica eh: "+geometrica);
                break;
            case 2:
                double pond= (n1+(2*n2)+(3*n3))/6;
                System.out.println("a media ponderada eh: "+pond);
                break;
            case 3:
                double harmonica= 1/((1/n1)+(1/n2)+(1/n3));
                System.out.println("a media harmonica eh: "+harmonica );
                break;
            case 4:
                double arit= (n1+n2+n3)/3;
                System.out.println("a media aritmetica: "+arit);
                break;
            default:
                System.out.println("ERROR");

        }
    }
}
