void main()
{
    IO.println("Prime numbers between 1 to 100");

    for(int num=2;num<=100;num++) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            IO.println("Prime number :"+num);
        }
    }
}