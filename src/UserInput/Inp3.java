void main()
{
    IO.print("Enter your name");
    
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    
    IO.println("Enter your rollNo");
    
    int rollNo = sc.nextInt();

    IO.println("My name is : "+name+" and roll no is : "+rollNo);
    
}