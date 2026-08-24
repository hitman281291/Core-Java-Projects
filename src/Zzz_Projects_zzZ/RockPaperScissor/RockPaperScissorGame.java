void main()
{
    Scanner sc = new Scanner(System.in);
    String playAgain;
    
    do{
        IO.println("****** Welcome to the Rock Paper Scissors Game! ******");

        Random r = new Random();
        int computerChoice = r.nextInt(1,3);// 1 for Rock, 2 for Paper, 3 for Scissors
        IO.println("I have choosen my option. Now choose your option:");

        int userChoice;

        do{
            IO.println("1 for Rock");
            IO.println("2 for Paper");
            IO.println("3 for Scissors");


            userChoice = sc.nextInt();

            if (userChoice <1 || userChoice > 3)
            {
                IO.println("Invalid choice. Please choose 1, 2, or 3.");
            }

        }
        while (userChoice < 1 || userChoice > 3);


        IO.println("Computer chose: " + gameChoice(computerChoice));
        IO.println("You chose: " + gameChoice(userChoice));

        if (computerChoice == userChoice)
        {
            IO.println("---- Match draw! Both chose the same option. ----");
        }
        else if ((computerChoice == 1 && userChoice == 3) || (computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2))
        {
            IO.println("You lose!");
        }
        else
        {
            IO.println("You win!");
        }

        IO.println("Do you want to play again? (yes/no)");
        playAgain = sc.next();
    }
while(playAgain.equalsIgnoreCase("yes"));
}


String gameChoice(int choice)
{
    String str = " ";
    switch (choice)
    {
        case 1:
           str = "Rock";
            break;
        case 2:
           str = "Paper";
            break;
        case 3:
           str = "Scissors";
            break;
    }
    return str;
}