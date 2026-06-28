//Program to find leap year
void main()
{
    IO.println("Enter the year :");
    
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    
    if(year%4==0 &&  year%100!=0)
    {
        IO.println("Entered year is a leap year");
    }
    else if(year%400==0)
    {
        IO.println("Entered year is a leap year");
    }
    else
    {
        IO.println("Entered year is not a leap year");
    }        

}