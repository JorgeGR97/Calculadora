
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class arithmetic {
    
    /** 
     * @param args
     * @throws IOException
     * @author jorgeGordillo
     */
    public static void main(String[] args) throws IOException {
        
       
    	Scanner sc = new Scanner(System.in);
        boolean salir = false;
    	int opcion;
    	
        while(!salir){
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Dividir");
            System.out.println("4.Multiplicar");
            System.out.println("5.Salir");

                try{
                    System.out.println("Selecciona una opcion");
                    opcion = sc.nextInt();

                    switch(opcion){
                        case 1:
                        System.out.println("Has seleccionado SUMAR");
                        double num1,num2,suma;
                        System.out.println("Introduce un numero");
                        num1 = sc.nextDouble();
                        System.out.println("Introduce otro numero");
                        num2 = sc.nextDouble();
                        suma = num1+num2;
                        System.out.println("Resultado: "+suma);
                        break;

                        case 2:
                        System.out.println("Has seleccionado RESTAR");
                        double res1,res2,resta;
                        System.out.println("Introduce un numero");
                        res1 = sc.nextDouble();
                        System.out.println("Introduce otro numero");
                        res2 = sc.nextDouble();
                        resta = res1-res2;
                        System.out.println("Resultado: "+resta);
                        break;

                        case 3:
                        System.out.println("Has seleccionado DIVIDIR");
                        double div1,div2,division;
                        System.out.println("Introduce un numero");
                        div1 = sc.nextDouble();
                        System.out.println("Introduce otro numero");
                        div2 = sc.nextDouble();
                        division = div1/div2;
                        System.out.println("Resultado: "+division);
                        break;

                        case 4:
                        System.out.println("Has seleccionado MULTIPLICAR");
                        double mul1,mul2,multiplicacion;
                        System.out.println("Introduce un numero");
                        mul1 = sc.nextDouble();
                        System.out.println("Introduce otro numero");
                        mul2 = sc.nextDouble();
                        multiplicacion = mul1*mul2;
                        System.out.println("Resultado: "+multiplicacion);
                        break;

                        case 5:
                        salir = true;
                        break;
                    }

                } catch(InputMismatchException e) {
                    System.out.println("Debes Introducir un numero");
                    sc.next();
                }   
        }
    
    }
    
}

