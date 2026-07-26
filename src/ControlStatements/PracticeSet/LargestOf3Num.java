void main()
{
    while(true)
    {
        IO.println("Enter three numbers:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();  // Consume the newline left in the buffer


        if(a>b&&a>c)
        {
            IO.println("Largest number is:"+a);
        } 
        else if (b>c&&b>a)
        {
            IO.println("Largest number is:"+b);
        }
        else
        {
            IO.println("Largest number is:"+c);
            
        }

        IO.println("Do you want to continue - yes or no");
        String choice = sc.nextLine();
        
        if(choice.equalsIgnoreCase("no")) {
            break;
        }
    }
    
}