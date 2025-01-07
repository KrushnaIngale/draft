public class Factorial{
  public static void main(String args[]){
  
  Factorial f = new Factorial();
  System.out.println(f.factorial(5));
  }
  
  int factorial(int num){
    int fact=1;
    if(num==0||num==1){
      return 1;
    }else{
      return num*factorial(num-1);
    }
  }
}
