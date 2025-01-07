public class Fibonacci{
  public static void main(String args[]){
    Fibonacci obj = new Fibonacci();
    
    System.out.println(obj.fibonacci(10));
    
    System.out.print(n1+" "+n2);
    obj.fibonacci1(10-1);
    System.out.println();
  }
  
  int fibonacci(int n){
    if(n==0 || n==1) {
      return n;
    }else if(n==2){
      return 1;
    }else{
      return fibonacci(n-1)+fibonacci(n-2);
    }
  }
  
  static int n1=2,n2=4,n3=0;
  void fibonacci1(int n){
    if(n>2){
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(" "+n3);
      fibonacci1(n-1);
    }
    
  }
}
