public class getShort{
  public static void main (String [] args){
  getShort obj = new getShort();
  
  System.out.println(obj.getShort(-32769));
  
   }
  int getShort(int num){
    int ans;
    int temp=num/32768;
    if(num>=0){
      if(temp%2==0){
        ans=num%32768;
      }else{
        ans=(num%32768)-32768;
      }
      return ans;
    }else{
      if(num==-32768){
        ans=-32768;
      }else if(temp%2==0){
        ans=num%32768;
      }else{
        ans=(num%32768)+32768;
      }
      return ans;
    }
  }
}
