void main()
{
    IO.println("Reverse a number");
    

    Scanner sc = new Scanner(System.in);
    
    
    IO.println("Enter the number which needs to be reversed");
    long num  = sc.nextLong();

    long rev = 0;
    
    while(num !=0 )
    {
        long rem = num%10;
        rev = rev*10 + rem;
        num = num/10;
    }
    
    IO.println("The reversed number is "+rev);
}