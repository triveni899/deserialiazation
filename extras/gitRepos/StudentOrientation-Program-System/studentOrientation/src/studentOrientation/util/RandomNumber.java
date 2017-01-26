package studentOrientation.util;

public enum RandomNumber {
	durationHigh(200), durationlow(20),
	costHigh(1000),costlow(300),
	footprintHigh(100),footprintLow(10),
	effortHigh(2000),effortLow(30)
	;
	
	

    private int numVal;
    
   /**
    * 
    * @param numVal //assign int value
    */

   RandomNumber(int numVal) {
        this.numVal = numVal;
    }
   
  
   

    public int getNumVal() {
        return numVal;
    }

}
