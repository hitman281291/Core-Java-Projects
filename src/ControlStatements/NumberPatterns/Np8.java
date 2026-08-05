void main()
{
    for(int i=1;i<=5;i++)
    {
        int count = i;
        int no=4;
        for (int j=1;j<=i;j++)
        {
            IO.print(count+" ");

            count = count+no;
            no--;
        }
        IO.println();
    }

//    for(int i=1;i<=5;i++)
//    {
//        int count = i;
//        
//        for (int j=1;j<=i;j++)
//        {
//            IO.print(count+" ");
//
//            count = count + (5-j);
//
//        }
//        IO.println();
//    }


}