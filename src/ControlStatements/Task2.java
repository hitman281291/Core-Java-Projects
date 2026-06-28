//Program to find leap year
void main()
{
   IO.println("Simple calculator app");
   
   IO.println("Choose option : \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
   
   Scanner sc = new Scanner(System.in);
   int option = sc.nextInt();
   boolean continueCalculator = true;
   
   while(continueCalculator) {
      if (option == 1 || option == 2 || option == 3 || option == 4) {
         IO.println("Enter two numbers :");
         int a = sc.nextInt();
         int b = sc.nextInt();

         int result;
         
         switch (option) {
            case 1:
               result = a + b;
               IO.println("Sum of two numbers is :" + result);
               break;

            case 2:
               result = a - b;
               IO.println("Difference of two numbers is :" + result);
               break;

            case 3:
               result = a * b;
               IO.println("Multiple of two numbers is :" + result);
               break;

            case 4:
               result = a / b;
               IO.println("Division of two numbers is :" + result);
               break;

         }

      } else {
         IO.println("Choose correct option from below : \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
      }
      
      IO.println("Do you want to continue - y/n");
      String response = sc.next();

      if(response.equals("n")) 
      {
         continueCalculator = false;
         IO.println("Thank you for using calculator app. You are a genius");
      }
   }
}