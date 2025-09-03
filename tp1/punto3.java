package tp1;
public class punto3{
public static void main(String[] args ){

    int A=1;
    int B=2;
    int C=3;

System.out.println ("antes de cambiar valores");
System.out.println("A = "+ A + " ","B =" + B +", C = " + C);
int auxiliar= C; 
B = A;
C = A;
A = auxiliar;
System.out.println("\nDespues del intercambio:");
System.out.println("A = " + A + ", B = " + B + ", C = " + C);
    }
}


