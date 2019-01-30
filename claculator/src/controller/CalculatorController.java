package controller;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

import java.util.Scanner;

//import java.util.Scanner;

public class CalculatorController {
   // Scanner input=new Scanner(System.in);
    Scanner input;
    CalculatorService calculatorService=new CalculatorServiceImpl();
   public CalculatorController(Scanner s)
    {
       input=s;
    }
    public void menu(){
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
    }
    public void process() {
        menu();
        int choice = input.nextInt();
        switch (choice)

        {
            case 1:
                this.addValue();
                break;

            case 2:
                subtractValue();
                break;

            case 3:
                multiplyValue();
                break;

            case 4:
                divisionValue();
                break;

            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input");

        }
    }
        public void addValue() {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter the second number");
            int b = input.nextInt();
            System.out.println(calculatorService.addition(a,b));
        }
        public void subtractValue() {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter the second number");
            int b = input.nextInt();
            System.out.println(calculatorService.subtraction(a, b));
        }
        public void multiplyValue() {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter the second number");
            int b = input.nextInt();
            System.out.println(calculatorService.multiplication(a, b));
        }
        public void divisionValue() {
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter the second number");
            int b = input.nextInt();
            System.out.println(calculatorService.division(a, b));
        }


    }




