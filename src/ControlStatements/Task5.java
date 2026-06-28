//swapping two numbers
void main()
{
    IO.println("Enter two numbers to swap their values");
    Scanner sc = new Scanner(System.in);
    
    IO.println("Enter first number :");
    int a = sc.nextInt();
    
    IO.println("Enter second number :");
    int b = sc.nextInt();
    
    IO.println("Value of first number is :" + a + " and second number is :" + b);
    
//  Logic without using a temp variable
    a = a+b;
    b = a-b;
    a = a-b;
    
    IO.println("After swapping value of first number is : "+a+" and second number is : "+b);

}