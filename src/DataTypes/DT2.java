int no = 1111; //instance variable

static int i = 500;

void add()
{
    int no1 = 10; //local variable to method add
    int no2 = 20;
    
    int res = no1 + no2 + no + i;

    IO.println("Add Result is : "+res);
}

void sub()
{
    int no3 = 100; //local variable
    int no1 = 10; //local variable

    int res = no3 - no1 - no - i; //local variable

    IO.println("Subtraction Result is : "+res);
}

static void m1()
{
    IO.println("Static i : "+ i);
//    IO.println("i : "+ no);
}

void main()
{
    add();
    sub();
    m1();
}