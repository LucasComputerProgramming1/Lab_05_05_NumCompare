public class NumCompare {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        System.out.println("Please enter a value for number 1");
        num1 = 5;
        System.out.println("Testing for "+num1);
        System.out.println("Please enter a value for number 2");
        num2 = 7;
        System.out.println("Testing for "+num2);
        if (num1==num2)
        {
            System.out.println("Your numbers are equal");
        }
        else if (num1<num2)
        {
            System.out.println(num1+" is less than "+num2);
        }
        else if (num1>num2)
        {
            System.out.println(num2+" is less than "+num1);
        }
        else
        {
            System.out.println("Your input for "+num1+" or "+num2+"is invalid. Please terminate and try again");
        }
    }
}