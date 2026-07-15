void main()
{
    IO.println("Check number is prime or not");
    

    Scanner sc = new Scanner(System.in);
    
    
    IO.println("Enter the number which needs to be checked prime or not");
    int num  = sc.nextInt();

    boolean isPrime = true;
    
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            IO.println("Number is prime");
        } else {
            IO.println("Number is prime");
        }
}