void main()
{
    IO.println("Fibonacci series");
    

    Scanner sc = new Scanner(System.in);
    
    
    int n1 = 0, n2 =1;
    
    IO.println("Enter the number till where fibonanni series is needed");
    int count  = sc.nextInt();

    IO.print(n1+" "+n2);
    
    for (int i = 1; i <= count; i++)
    {
        int sum =  n1 + n2;
        IO.print(" "+sum);
        
        n1 = n2; //swapping numbers
        n2 = sum; //swapping numbers
    }
}