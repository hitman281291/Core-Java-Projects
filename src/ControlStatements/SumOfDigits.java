void main()
{
    IO.println("Welcome to the Sum Of Digits Calculator Program");

    IO.println("Enter a number");

    Scanner sc = new Scanner(System.in);
    
    Long num = sc.nextLong();
    
    int sum = 0;

    while(num!=0)
    {
        sum += num % 10;
        num = num/10;
    }
    
    IO.println("Sum of digits is :"+sum);
}