void main()
{
    IO.println("Check if number is even or odd");
    
    Scanner sc = new Scanner(System.in);
    
    IO.println("Please enter a number :");
    int num = sc.nextInt();

    if(num==0)
    {
        IO.println("Number is a whole number");
    }
    else if(num%2 == 0)
    {
        IO.println("Number is even");
    }
    else
    {
        IO.println("Number is odd");
    }
}