void main()
{
    IO.println("Enter a number to find it's factorial");

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int factorial = 1;

    IO.println("Factorial of " + n + " is: " );
    for(int i = n; i>=1; i--)
    {
        IO.print(i);
        if(i > 1) {
            IO.print(" x ");
        }
        factorial = factorial * i;
    }
    IO.print(" = " + factorial);
}