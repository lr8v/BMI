import java.util.Scanner;
class BMI {
    public static void main(String[] args){
        System.out.println("Hello welcome to BMI Calculater for adults");
        //the beginning of the program
        System.out.println("\n please enter your Weight (Kg):");
        Scanner num1 = new Scanner(System.in);
        //to let the user write its weight
        float y = num1.nextFloat();
        System.out.println("\n please enter your Height (M):");
        Scanner number2 = new Scanner(System.in);
        //to let the user write its height
        float x = number2.nextFloat();
        float hw; //the BMI result
        x=x*x; //to solve the height rule
        hw=y/x; //to solve the mathematical rule
        if (hw<=18.5) {
            System.out.print("Your BMI is :\t" + hw);
            System.out.println(", and based on the calculated BMI you have (Underweight)");
            //will sent if the BMI is under 18.5
        }
        else if (hw>=18.5 || hw<=24.9) {
            System.out.print("Your BMI is :\t" + hw);
            System.out.println(", and based on the calculated BMI you have (Normal weight)");
            //will sent if the BMI between 18.5 and 24.9
        }
        else if (hw>=25 || hw<=29.9) {
            System.out.print("Your BMI is :\t" + hw);
            System.out.println(", and based on the calculated BMI you have (Overweight)");
            //will sent if the BMI between 25 and 29.9
        }
        else if (hw>=30) {
            System.out.print("Your BMI is :\t" + hw);
            System.out.println(", and based on the calculated BMI you have (Obase)");
            //wil sent if the BMI over 30
        }
    }

}        