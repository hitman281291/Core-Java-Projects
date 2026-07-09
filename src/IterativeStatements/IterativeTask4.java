void main()
{
    IO.println("Calculator App");
    
    IO.println("Enter the operation you want to perform :");
    IO.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    do
    {
        switch(n)
        {
            case 1:
                IO.println("Enter two numbers to add");
                int a = sc.nextInt();
                int b = sc.nextInt();
                IO.println("Sum of provided numbers "+a+" and "+b+" is "+(a+b));
                break;
            case 2:
                IO.println("Enter two numbers to subtract");
                int c = sc.nextInt();
                int d = sc.nextInt();
                IO.println("Difference of provided numbers "+c+" and "+d+" is "+(c-d));
                break;
            case 3:
                IO.println("Enter two numbers to multiply");
                int e = sc.nextInt();
                int f = sc.nextInt();
                IO.println("Product of provided numbers "+e+" and "+f+" is "+(e*f));
                break;
            case 4:
                IO.println("Enter two numbers to divide");
                int g = sc.nextInt();
                int h = sc.nextInt();
                if(h==0)
                    IO.println("Division by zero is not allowed");
                else
                    IO.println("Quotient of provided numbers "+g+" and "+h+" is "+(g/h));
                break;
            default:
                IO.println("Invalid operation selected. Please select a valid operation.");
        }

        IO.println("Enter the operation you want to perform :");
        IO.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\nEnter any other number to exit");
        n = sc.nextInt();
    }
    while(n>=1&&n<=4);
        
}