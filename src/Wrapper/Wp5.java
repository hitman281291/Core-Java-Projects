void main() {
    
    
    //unboxing
    Integer obj = 100;
    int num1 = obj.intValue();
    IO.println(num1); //Unboxing --> Converting an Wrapper class object to its corresponding primitive data type

    //autounboxing
    Integer obj2 = 200;
    int num2 = obj2;
    IO.println(num2);
}