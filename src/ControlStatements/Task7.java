void main()
{
    IO.println("Check if entered value is palindrome or not");
    
    Scanner sc = new Scanner(System.in);
    
    IO.println("Please enter a value :");
    String value = sc.nextLine();

    String original = value;
    String rev = "";

    for(int i=value.length()-1; i>=0; i--)
    {
        rev = rev + value.charAt(i);
    }
    
    if(rev.equals(original))
    {
        IO.println("The value is palindrome");
    }
    else
    {
        IO.println("The value is not palindrome");
    }
}