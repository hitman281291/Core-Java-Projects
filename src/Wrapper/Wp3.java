void main() {

    int num1 = 100 ,  num2 = 200;

    
    if(num1 > num2){
        IO.println(num1 + " is larger than " +  num2);
    }
    
    else
    {
        IO.println(num2 + " is larger than " +  num1);
    }
    
    
    int max = Integer.max(num1, num2);
    IO.println("Maximum value is : " + max);

     int min = Integer.min(num1, num2);
     IO.println("Minimum value is : " + min);


}