void m1()
{
    IO.println("I am in m1() method");
}

void main()
{   m1();
    IO.println("I am in main() method");
    m1(); //calling method
}