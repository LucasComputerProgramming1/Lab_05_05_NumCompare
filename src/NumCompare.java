public class NumCompare {
    public static void main(String[] args) {
        //Declare Variables
        int num1 = 0;
        int num2 = 0;
        //Prompt For Num1
        System.out.println("Please enter a value for number 1");
        //Input For Num1
        num1 = 5;
        System.out.println("Testing for "+num1);
        //Prompt For Num2
        System.out.println("Please enter a value for number 2");
        //Input For Num2
        num2 = 7;
        System.out.println("Testing for "+num2);
        //Output If Equal
        if (num1==num2)
        {
            System.out.println("Your numbers are equal");
        }
        //Output If Num1 Is Less
        else if (num1<num2)
        {
            System.out.println(num1+" is less than "+num2);
        }
        //Output If Num2 Is Less
        else if (num1>num2)
        {
            System.out.println(num2+" is less than "+num1);
        }
        //Output If Invalid
        else
        {
            System.out.println("Your input for "+num1+" or "+num2+"is invalid. Please terminate and try again");
        }
    }
}