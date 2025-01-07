public class FindOddEven{
  public static void main(String args[]){
    FindOddEven obj = new FindOddEven();
    int[] arr={2,3,1,4,5,6};
    int index= arr.length-1;
    int[] ans=obj.findOddEven(arr,index);
    //System.out.println(arr.length-1);
    System.out.println("even="+ans[0]);
    System.out.println("odd="+ans[1]);
  }
  
  int[] findOddEven(int[] arr,int index){
    if(index<0){
      return new int[]{0,0};
    }
    
    int [] count=findOddEven(arr,index-1);
    if(index%2==0){
      count[0]++;
    }else{
      count[1]++;
    }
    return count;
  }
}
