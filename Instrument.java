public class Instrument{
    //attributes
    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customer_mobile_number;
    private int customerPANnumber;

    //constructor

    public Instrument(String instrumentName){

        //attribute=parameter

    instrumentID = instrumentID++;
    this.instrumentName = instrumentName;
    this.customerName = "";// empty string
    this.customer_mobile_number = ""; // empty string
    this.customerPANnumber = 0;
    }
      
      // 5 getter 
    public int getinstrumentID(){
        return Instrument.instrumentID;
    }
    public String getinstrumentName(){
        return this.instrumentName;
    }    
    public String getcustomerName(){
        return this.customerName;
    }    
    public String getcustomer_mobile_number(){
        return this.customer_mobile_number;
    }    
    public int getcustomerPANnumber(){
        return this.customerPANnumber;
    }    

    //setter logic

    public void setinstrumentID(int instrumentID){
        Instrument.instrumentID = instrumentID;
    }
    public void setinstrumentName(String instrumentName){
        this.instrumentName = instrumentName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setcustomer_mobile_number(String customer_mobile_number){
        this.customer_mobile_number = customer_mobile_number;
    }
    public void setcustomerPANnumber(int customerPANnumber){
        this.customerPANnumber = customerPANnumber;
    }
    

    public void display(){
        System.out.println("InstrumentID is:"+this.instrumentID);
        System.out.println("InstrumentName is:"+this.instrumentName);
        if(this.customerName != "" && this.customer_mobile_number != "" && this.customerPANnumber != 0) {

            System.out.println("The customer's Name is:"+this.customerName);
        
        
            System.out.println("Customer's contact no. is:"+this.customer_mobile_number);
        
            System.out.println("Customer's PAN number is:"+this.customerPANnumber);
           }

    }
}
