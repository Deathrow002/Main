import Christmas_Tree.ChrismasTree;
import Distance_Cal.DistanceCal;
import Forex.Forex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        //  1. Christmas Tree
        System.out.print("Input Number more than 4: ");
        int numInput = myObj.nextInt();
        new ChrismasTree().createTree(numInput);

//        //  2. Forex
//        System.out.print("Input Number on THB: ");
//        int THBInput = myObj.nextInt();
//        System.out.print("Input String Currency Type: ");
//        String CurInput = myObj.next();
//        new Forex().forex(THBInput, CurInput);
//
//        //  3. DistanceCal
//        System.out.print("Input Gas Liter: ");
//        int FuelInput = myObj.nextInt();
//        new DistanceCal().Calculator(FuelInput);
    }
}