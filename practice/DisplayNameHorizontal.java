public class DisplayNameHorizontal{
  public static void main(String arg[]){
    DisplayNameHorizontal obj = new DisplayNameHorizontal();
    int size=9;
    if(size<5){
      size=5;
    }else if(size>12){
      size=18;
    }
    for(int ln=1;ln<=size;ln++){
      if(size%2==0){
        obj.displayK(ln,size+1);
      }else{
        obj.displayK(ln,size);
      }
      obj.displayR(ln,size);
      obj.displayU(ln,size);
      obj.displayS(ln,size);
      obj.displayH(ln,size);
      obj.displayN(ln,size);
      if(size%2==0){
        obj.displayA(ln,size);
      }else{
        obj.displayA(ln,size+1);
      }
    }
   
    System.out.println();
    /*obj.displayU(6);
    System.out.println();
    obj.displayS(6);
    System.out.println();
    obj.displayH(6);
    System.out.println();
    obj.displayN(6);
    System.out.println();
    obj.displayA(6);
    System.out.println();*/
  }
  
  void displayK(int ln,int size){
    //for(int ln=1;ln<=size;ln++){
      if(ln<=size/2 ){//
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-ln){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }//System.out.println();
      }else if(ln>(size/2)+1){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==ln-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }//System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt<=size-ln){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }//System.out.println();
      }
    //}
  }
  
  void displayR(int ln,int size){
      //for(int ln=1;ln<=size;ln++){
        if(ln==1||ln==(size/2)+1){
          System.out.print("+");
          for(int plus=1;plus<=size-3;plus++){
            System.out.print("+");
          }
            System.out.print("  ");
            //System.out.println();
        }else if(ln>1&&ln<(size/2)+1){
          System.out.print("+");
          for(int space=1;space<size-2;space++){
            System.out.print(" ");
          }
          System.out.print("+");
          System.out.print(" ");
          //System.out.println();
        }
        if(ln>(size/2)+1){
          for(int pt=1;pt<=size;pt++){
            if(pt==1||pt==ln-2){
              System.out.print("+");
            }else{
              System.out.print(" ");
            }
            
          }
          //System.out.println();
        }
      //}
  }
  
  void displayU(int ln,int size){
    //for(int ln=1;ln<=size;ln++){
      if(ln<size){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
        //System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt>1 && pt<size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
      }
    //}
    //System.out.println();
  }
  
  void displayS(int ln,int size){
      //for(int ln=1;ln<=size;ln++){
        if(ln==1){
          System.out.print(" ");
          for(int plus=1;plus<=size-2;plus++){
            System.out.print("+");
          }
            System.out.print(" ");
            //System.out.println();
        }
        else if(ln>1&&ln<=size/2){
          System.out.print("+");
          for(int space=1;space<=size-1;space++){
            System.out.print(" ");
          }
          //System.out.println();
        }
        else if(ln==(size/2)+1){
          System.out.print(" ");
            for(int plus=1;plus<size-2;plus++){
              System.out.print("+");
            }
            System.out.print("  ");
            //System.out.println();
        }
        else if(ln>(size/2)+1 && ln<size){
            for(int space=1;space<size-1;space++){
              System.out.print(" ");
            }
            System.out.print("+");
            System.out.print(" ");
            //System.out.println(); 
        }
        else {
          for(int plus=1;plus<=size-2;plus++){
            System.out.print("+");
          }
          System.out.print("  ");
          //System.out.println();
        }
      }
    //}
    
  void displayH(int ln,int size){
    //for(int ln=1;ln<size;ln++){
      if(ln==(size/2)+1){
        for(int pt=1;pt<size;pt++){
          System.out.print("+");
        }
          System.out.print(" ");
          //System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }//System.out.println();
      }
    }
  //}
  
  void displayN(int ln,int size){
    int temp=size;
      for(int pt=1;pt<=size;pt++){
        if(pt==1||pt==size||pt==ln){
          System.out.print("+");
        }else{
          System.out.print(" ");
        }
      }
      System.out.print(" ");
      //System.out.println();
  }
  
  void displayA(int ln,int size){
    //for(int ln=1;ln<=size;ln++){
      if(ln<size/2){
        for(int space=(size/2);space>ln;space--){
          System.out.print(" ");
        }
        System.out.print("+");
        if(ln>1){
          for(int space=1;space<ln;space++){
            System.out.print(" ");
          }
          for(int space=1;space<ln-1;space++){
            System.out.print(" ");
          }
          System.out.print("+");
        }
        for(int space=ln;space<size/2;space++){
          System.out.print(" ");
        }
        System.out.print(" ");
        System.out.println();
      }
      if(ln==(size/2)){
        for(int pt=1;pt<size;pt++){
            System.out.print("+");
        }
        System.out.println();
      }
      if(ln>(size/2)){
        for(int pt=1;pt<size;pt++){
          if(pt==1||pt==size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }System.out.println();
      }
    }
      
  //}
}

  /*void displayK(int size){
    for(int ln=1;ln<=size;ln++){
      if(ln<=size/2 ){//
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-ln){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
      }else if(ln>(size/2)+1){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==ln-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt<=size-ln){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
      }System.out.println();
    }

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
  void displayU(int size){
    for(int row=1;row<=size;row++){
      if(row<size){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt>1 && pt<size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }
      }
    }
    System.out.println();
  }
  
  void displayH(int size){
    for(int row=1;row<size;row++){
      if(row==(size/2)){
        for(int pt=1;pt<size;pt++){
          System.out.print("+");
        }
        System.out.print(" ");
        System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            System.out.print("+");
          }else{
            System.out.print(" ");
          }
        }System.out.println();
      }
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
    
  void displayN(int size){
    int temp=size;
    for(int row=1;row<=size;row++){
      for(int pt=1;pt<=size;pt++){
        if(pt==1||pt==size-1||pt==row){
          if(pt==temp){
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
  
  void displayA(int size){
      for(int row=1;row<=size;row++){
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
    */
