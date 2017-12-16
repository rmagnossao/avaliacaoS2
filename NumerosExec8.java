
public class NumerosExec8 {

	public static void main (String[]args){
         
    int a = 1006;
    int b = 10;
    int aSize = String.valueOf(a).length();
    int bSize = String.valueOf(b).length();
    int cSize = aSize + bSize;
    
    int pos = 0;
    

    CharSequence[] cArray = new CharSequence[aSize+bSize];
    
   String validator = (a + "" + b);


   for (int n=0; n<cSize; n++){


        if ( Integer.parseInt(validator) > 1000000){
          cArray[pos] = String.valueOf(-1);
          break;
      }
        
        if (n < aSize){
          cArray[pos] = String.valueOf(a).subSequence(n,n+1);
          pos++;
          

        }
        
        if (n < bSize){ 
          cArray[pos] = String.valueOf(b).subSequence(n,n+1);
          pos++;
        }
	}

  for (int n=0; n<cSize; n++){
   if (cArray[n] == null)
      break;
    System.out.println(cArray[n]);
  }



	}
}