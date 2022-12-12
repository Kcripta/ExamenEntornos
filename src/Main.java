import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc=0,i,j,area;
        System.out.println("Hello world!");
        while(!(opc==5)) {
            System.out.println("----------Menu-----------" +
                    "\n1.Area triangulo" +
                    "\n2.Area circulo" +
                    "\n3.Area del cono" +
                    "\n4.Area del cilindro" +
                    "\n5.Salir");
            System.out.println("-------------------------");
            opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Cuanto mide la altura del triangulo?");
                    i=sc.nextInt();
                    System.out.println("Cuanto mide la base del triangulo?");
                    j=sc.nextInt();
                    area=i*j;
                    System.out.println("El area del tringulo es "+area);
                    break;
            }
        }
    }
}