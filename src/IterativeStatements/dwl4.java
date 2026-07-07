void main()
{ 
    Scanner sc=new Scanner(System.in);
    String user_input = "yes";

    
    do
    {
        IO.println("-------Statements Executed------------");
        
        IO.println("Do you want to continue (yes / no)");
        user_input = sc.next();
    }

    while(user_input.equalsIgnoreCase("yes"));
    
}