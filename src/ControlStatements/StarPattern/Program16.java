void main()
{
    for (int i = 1; i <= 5; i++)
    {
//        for (int j = 1; j <= 5; j++) {
//            if (i == j || (i + j == 6)) {
//                IO.print("*");
//            }
//            else {
//                IO.print(" ");
//            }
//        }


        for (int j = 1; j <= 5; j++) {
            if (i == j || j==(5-i+1)) {
                IO.print("*");
            }
            else {
                IO.print(" ");
            }
        }

        IO.println();
        
    }
    
}