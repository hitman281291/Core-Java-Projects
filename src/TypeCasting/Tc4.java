void main() {

int n1 = 10;
byte b1 = (byte)(short) n1; //narrowing using multiple cast operator but it is not recommended

IO.println(b1);
}