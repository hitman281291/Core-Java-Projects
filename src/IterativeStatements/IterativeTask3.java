void main()
{
    IO.println("Enter any long number");
    
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();
    
//    int length = n.toString().length();
//
//    IO.println("Number of digits in provided number "+n+" is "+length);

    for(int i=n.toString().length(); i<=n.toString().length(); i++)
    {
        IO.println("Number of digits in provided number " + n + " is " + i);
    }

}