package org.niraj.mainfunction;

import controller.CalculatorController;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      // Scanner input=new Scanner(System.in);
        CalculatorController calculatorController=new CalculatorController(new Scanner(System.in));
while (true)
{
   calculatorController.process();

}
    }
}
