//greatest of two numbers
void main()
{
    IO.println("Enter two numbers to find greatest number");
    Scanner sc = new Scanner(System.in);
    
    IO.println("Enter first number :");
    int a = sc.nextInt();
    
    IO.println("Enter second number :");
    int b = sc.nextInt();
    
    IO.println(a>b? "First number is greater than second number"
               : (b>a 
                    ? "Second number is greater than first number"
                    : "Both numbers are equal"));
}