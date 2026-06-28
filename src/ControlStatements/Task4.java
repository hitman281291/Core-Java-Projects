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

//  Logic using a temp variable
    int temp = a;
    a = b;
    b = temp;
    
    IO.println("After swapping value of first number is : "+a+" and second number is : "+b);

}