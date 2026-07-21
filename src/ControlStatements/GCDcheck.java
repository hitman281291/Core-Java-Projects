void main()
{
    IO.println("Find GCD of two numbers");
    
    Scanner sc = new Scanner(System.in);

    IO.println("Enter two numbers :");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int gcd = 1;

    for(int i=1; i<=n1 && i<=n2; ++i)
    {

        if(n1%i==0 && n2%i==0)
        {
            gcd = i;
        }
    }

    IO.println("GCD of two numbers is : "+gcd);

}