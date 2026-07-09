void main()
{
    Scanner sc=new Scanner(System.in);
    
    IO.println("Enter a number whose factorial is needed");
    int n = sc.nextInt();

    long factorial = 1;
    
    for(int i=1; i<=n; i++)
    {
        factorial = factorial * i;

    }
    
    IO.println("Factorial of provided value "+n+" is "+factorial);
}