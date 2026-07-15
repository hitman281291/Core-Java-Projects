void main()
{
    IO.println("Finding LCM of two number");
    

    Scanner sc = new Scanner(System.in);
    
    
    IO.println("Enter the numbers whose LCM is needed");
    int n1  = sc.nextInt();
    int n2  = sc.nextInt();

    int lcm = n1;
    
    if(n2>n1)
    {
        lcm = n2;
    }
    
    while (true)
    {
        if(lcm % n1 == 0 && lcm % n2 == 0)
        {
            IO.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);
            break;
        }
        lcm++;
    }
}