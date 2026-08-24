void main()
{
 
     IO.println("====== Welcome to the Guess the Number Game! ======");
    
     do
     {
         Random r = new Random();
         int guess = r.nextInt(1, 101);

         IO.println("I have choosen a number between 1 & 100");


         Scanner sc = new Scanner(System.in);

         int attempts = 0;

         while(true)
         {
             attempts++;
             IO.println("Enter your guess:");
             int num = sc.nextInt();

             if (num < guess) {
                 IO.println("Too Low! Try again.");
             } else if (num > guess) {
                 IO.println("Too High! Try again.");
             } else {
                 IO.println("Congratulations! You guessed the number.");
                 IO.println("It took you " + attempts + " attempts.");
                 
                 IO.println("Do you want to play again? (yes/no)");
                 String playAgain = sc.next();
                 if (playAgain.equalsIgnoreCase("yes"))
                 {
                     break;
                 }
                    else
                    {
                        IO.println("Thank you for playing! Goodbye!");
                        return;
                    }
            }
     }
 } while(true);
    
}