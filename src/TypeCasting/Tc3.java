void main() {

int n1 = 10;
byte b1 = (byte) n1; //narrowing

IO.println(b1);

//----------------------

    int n2 = 500;
    byte b2 = (byte) n2; //data loss happening here
    
    IO.println(b2);

}