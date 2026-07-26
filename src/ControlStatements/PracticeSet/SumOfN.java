void main()
{
    IO.println("Enter a number upto which sum is needed");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;

    for (int i=1;i<=n;i++)
    {
        sum = sum + i;
        
        
    }
    IO.println("Sum of all number is :"+sum);
}