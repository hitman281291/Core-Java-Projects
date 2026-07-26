void main() {

    IO.println("Enter a number: ");
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n%2==0) {
        IO.println(n + " is an even number.");
    } else {
        IO.println(n + " is an odd number.");
    }

}