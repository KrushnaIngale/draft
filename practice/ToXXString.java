public class Practical4{
	public static void main(String[] args){
		Practical4 obj = new Practical4();
    System.out.println(obj.toXXString("H2","b"));
	}
  
  String toXXString(String num, String toBase) {
        int decimalValue=0;
        if (num.startsWith("B")) {
            decimalValue = toDecimal(num.substring(1), 2); 
        }else if (num.startsWith("O")){
            decimalValue = toDecimal(num.substring(1), 8); 
        }else if (num.startsWith("H")){
            decimalValue = toDecimal(num.substring(1), 16);
        }else if (num.startsWith("D")){
            decimalValue = toDecimal(num.substring(1), 10);
        }else{
            System.out.println("Error: Input must start with B, O, H, or D.");
        }

        String result="0";
        if (toBase.equalsIgnoreCase("B")){
            result = "B" + fromDecimal(decimalValue, 2); 
        }else if (toBase.equalsIgnoreCase("O")){
            result = "O" + fromDecimal(decimalValue, 8); 
        }else if (toBase.equalsIgnoreCase("H")){
            result = "Ox" + fromDecimal(decimalValue, 16);
        }else if (toBase.equalsIgnoreCase("D")) {
            result = "D" + fromDecimal(decimalValue, 10);
        }else{
            //throw new IllegalArgumentException("Input must start with B, O, H, or D.");
            System.out.println("Error: Input must start with B, O, H, or D.");
        }
        return result;
    }

    int toDecimal(String num,int base) {
        int decimalValue= 0;
        int power= 1;

        for (int i=num.length()-1;i>=0;i--){
            char digit=num.charAt(i);
            int value;
            if(digit >='0' && digit <='9'){
              value=digit-'0';
            }else{
              value=digit-'A'+10;
            } 
            
            decimalValue += value*power;
            power *= base;
        }
        return decimalValue;
    }

    String fromDecimal(int decimalValue, int base) {
        String result = "";

        while (decimalValue > 0) {
            int remainder = decimalValue % base;
            char digit ;
            if(remainder < 10 ){
              digit=(char)(remainder + '0');
            }else{
              digit=(char)(remainder - 10 + 'A');
            }
          
            result = digit + result;
            decimalValue /= base;
        }
        return result.isEmpty() ? "0" : result;
    }
}
