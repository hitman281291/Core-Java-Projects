void main()
{
    Scanner sc=new Scanner(System.in);
    
    IO.println("Enter a number whose table is needed");
    int n = sc.nextInt();

    IO.println("Table of provided number "+n+" is :");
    for(int i=1; i<=10; i++)
    {
        IO.println(n+"x"+i+" = "+(n*i));
    }
    
}