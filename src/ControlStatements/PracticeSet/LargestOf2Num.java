void main()
{
    do
    {
        IO.println("Enter two numbers:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();  // Consume the newline left in the buffer


        if(a>b)
        {
            IO.println("Largest number is:"+a);
        }
        else
        {
            IO.println("Largest number is:"+b);
        }

        IO.println("Do you want to continue - yes or no");
        String c = sc.nextLine();
        
        if(c.equalsIgnoreCase("no")) {
            break;
        }
    }
    while(true);
    
}