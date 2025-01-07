public class DispalyName{
  public static void main(String arg[]){
    DispalyName obj = new DispalyName();
    obj.displayK(6);
    System.out.println();
    obj.displayR(6);
    System.out.println();
    obj.displayU(6);
    System.out.println();
    obj.displayS(6);
    System.out.println();
    obj.displayH(6);
    System.out.println();
    obj.displayN(6);
    System.out.println();
    obj.displayA(6);
    System.out.println();
    
    
  }
  void displayK(int size){

      for(int row=1;row<=size;row++){
        if(row==(size/2)+1){
            for(int mid=(size-row)-1;mid>0;mid--){
              System.out.print("+");
            }
          }
        for(int col=1;col<=size;col++){
          if(row<(size/2)+1){
            if(col==size-row){
              System.out.print("+");
            }
          }
          if(row>(size/2)+1){
            if(col==row-1){
              System.out.print("+");
            }
          }
          if(col==1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    
      
  }
  
  void displayH(int size){
    int mid,mid1;
    if(size%2==1){
      mid=(size/2)+1;
        for(int row=1;row<=size;row++){
          for(int col=1;col<=size;col++){
            if(row==mid){
              while(col<size){
                System.out.print("+");
                col++;
              }
            }else if(col==1||col==size-1){
              System.out.print("+");
            }else{
              System.out.print(" ");
            }
          }
        System.out.println();
      }
    }else{
      mid=size/2;
      mid1=mid+1;
      for(int row=1;row<=size;row++){
        for(int col=1;col<=size;col++){
          if(col==1||col==size-1){
            System.out.print("+");
          }else if(row==mid||row==mid1){
            while(col<size){
                System.out.print("+");
                col++;
            }
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
  
  void displayN(int size){
    int temp=size;
    for(int row=1;row<=size;row++){
      for(int col=1;col<=size;col++){
        if(col==1||col==size-1||col==row){
          if(col==temp){
            continue;
          }
          System.out.print("+");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  
  void displayU(int size){
    for(int row=1;row<size;row++){
      for(int col=1;col<=size;col++){
        if(col==1||col==size-1){
          System.out.print("+");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    if(size>3){
      System.out.print(" ");
      for(int plus=1;plus<=size-3;plus++){
        System.out.print("+");
      }
      System.out.print(" ");
    }
    System.out.println();
  }
  
  void displayR(int size){
    if(size<7){
      for(int row=1;row<=size;row++){
        if(row==1||row==(size/2)+1){
          System.out.print("+");
          for(int plus=1;plus<=size-3;plus++){
            System.out.print("+");
          }
            System.out.print(" ");
            System.out.println();
        }
        if(row>1&&row<(size/2)+1){
          System.out.print("+");
          for(int space=size/2;space>0;space--){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.println();
        }
        if(row>size/2){
          System.out.print("+");
          for(int space=1;space<row-2;space++){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.println();
        }
      }
      System.out.println();
  }else{
    for(int row=1;row<=size;row++){
        if(row==1||row==(size/2)+1){
          for(int plus=1;plus<size-3;plus++){
            System.out.print("+");
          }
            System.out.print(" ");
            System.out.println();
        }
        if(row>1&&row<(size/2)+1){
          System.out.print("+");
          for(int space=1;space<size-4;space++){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.println();
        }
        if(row>size/2){
          System.out.print("+");
          for(int space=3;space<row-2;space++){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.println();
        }
      }
      System.out.println();
    }
  }
  
  void displayS(int size){

      for(int row=1;row<=size;row++){
        if(row==1){
          System.out.print(" ");
          for(int plus=1;plus<=size-2;plus++){
            System.out.print("+");
          }
            System.out.print(" ");
            System.out.println();
        }
        if(row>1&&row<(size/2)+1){
          System.out.print("+");
          for(int space=1;space<=size-1;space++){
            System.out.print(" ");
          }
          System.out.println();
        }
        if(row==(size/2)+1){
          System.out.print(" ");
          if(size<7){
            for(int plus=1;plus<row;plus++){
              System.out.print("+");
            }
            System.out.print(" ");
            System.out.println();
          }else{
            for(int plus=1;plus<=row;plus++){
              System.out.print("+");
            }
            System.out.print(" ");
            System.out.println(); 
          }
        }
        if(row>(size/2)+1 && row<=size){
          if(size<7){
            for(int space=(size/2)+2;space>1;space--){
              System.out.print(" ");
            }
            System.out.print("+");
            System.out.println();
          }else{
            for(int space=(size/2)+2;space>0;space--){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.println(); 
          }
        }
        if(row==size){
          for(int plus=1;plus<=size-2;plus++){
            System.out.print("+");
          }
          System.out.print("  ");
          System.out.println();
        }
      }
    }
    
    void displayA(int size){
      for(int row=1;row<=size;row++){
        /*if(row==1){
          for(int pt=1;pt<size;pt++){
            if(pt==(size/2)){
              System.out.print("+");
            }else{
              System.out.print(" ");
            }
          }System.out.println();
        }*/
        if(row<=size/2){
          for(int space=(size/2);space>row;space--){
            System.out.print(" ");
          }
          System.out.print("+");
          if(row>1){
            for(int space=1;space<row;space++){
              System.out.print(" ");
            }
            for(int space=1;space<row-1;space++){
              System.out.print(" ");
            }
            System.out.print("+");
          }
          for(int space=row;space<size/2;space++){
            System.out.print(" ");
          }
          System.out.print(" ");
          System.out.println();
        }            
        if(row>(size/2)+1){
          for(int pt=1;pt<size;pt++){
            if(pt==1||pt==size-1){
              System.out.print("+");
            }else{
              System.out.print(" ");
            }
          }System.out.println();
        }
        if(row==(size/2)+1){
          for(int pt=1;pt<size;pt++){
              System.out.print("+");
          }
          System.out.println();
        }
      }
    }
}
