import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc=0,i,j,area;
        double k,l,areac;
        System.out.println("Hello world!");
        while(!(opc==6)) {
            System.out.println("----------Menu-----------" +
                    "\n1.Area triangulo" +
                    "\n2.Area circulo" +
                    "\n3.Area del cono" +
                    "\n4.Area del cilindro" +
                    "\n5.Volumen esfera" +
                    "\n6.Salir");
            System.out.println("-------------------------");
            opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Cuanto mide la altura del triangulo?");
                    i=sc.nextInt();
                    System.out.println("Cuanto mide la base del triangulo?");
                    j=sc.nextInt();
                    area=(i*j)/2;
                    System.out.println("El area del tringulo es "+area);
                    break;
                case 2:
                    System.out.println("Cuanto mide el radio del circulo?");
                    k=sc.nextDouble();
                    areac=(k*k)*(3.14);
                    System.out.println("El area del circulo es "+areac);
                    break;
                case 3:
                    System.out.println("Cuanto mide el radio del cono?");
                    k=sc.nextDouble();
                    System.out.println("Cuanto mide la hipotenusa del cono?");
                    l=sc.nextDouble();
                    areac=(3.14*k*l)+(3.14*(k*k));
                    System.out.println("El area del cono es "+areac);
                    break;
                case 4:
                    System.out.println("Cuanto mide el radio del cilindro?");
                    k=sc.nextDouble();
                    System.out.println("Cuanto mide la altura del cilindro?");
                    l=sc.nextDouble();
                    areac=2*k*3.14*(l+k);
                    System.out.println("El area del cilindro es "+areac);
                    break;
                case 5:
                    System.out.println("Cuanto mide el radio del cilindro?");
                    k=sc.nextDouble();
                    areac=(4/3)*(3.14)*(k*k*k);
                    System.out.println("El volumen del esfera es "+areac);
                    break;

            }
        }System.out.println("Hasta la proxima");
    }
}