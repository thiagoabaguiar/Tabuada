import java.util.Scanner;

public class App{

    public static void main(String[] args){

        int numberToMultiplicationTable;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual tabuada deseja visualizar?");
        numberToMultiplicationTable = input.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println(numberToMultiplicationTable + " x " + i + " = " + numberToMultiplicationTable * i);

        }
        
        input.close();

    }

}