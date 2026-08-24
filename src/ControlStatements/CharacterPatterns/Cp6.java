void main()
{
//    char ch = 'A';
//
//    for(int i=1;i<=4;i++)
//    {
//        char ch = 'A';
//        for (int j = 1; j <= i; j++) {
//            ch = (char) (ch-1);
//            
//            IO.print(ch + " ");
//
////            ch = (char) (ch+2);
//        }
//        ch = (char) (ch+2);
//
//        IO.println();
//        
//    }



//    int rows = 4;

    for (int i = 1; i <= 4; i++) {

        // Print leading spaces
        for (int j = 1; j <= 4 - i; j++) {
            System.out.print("  ");
        }

        // Print increasing characters
        char ch = (char) ('A' + i - 1);

        for (int j = 1; j <= 4; j++) {
            System.out.print(ch + " ");
            ch++;
        }

        // Print decreasing characters
        ch -= 2;

        for (int j = 1; j < 4; j++) {
            System.out.print(ch + " ");
            ch--;
        }

        System.out.println();
    }
}
