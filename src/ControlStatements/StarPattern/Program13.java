void main()
{
//    for (int i = 1; i <= 5; i++)
//    {
//        for (int j = 1; j <= i; j++)
//        {
//            IO.print(" ");
//        }
//        
//        IO.println("*");
//    }


//    for (int i = 1; i <= 5; i++)
//    {
//        for (int j = 5; j >= i; j--)
//        {
//            IO.print(" ");
//        }
//
//        IO.println("*");
//    }


    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if(i==j)
            {
                IO.print("*");
            }
            else
            {
                IO.print(" ");
            }
        }

        IO.println(" ");
    }

}