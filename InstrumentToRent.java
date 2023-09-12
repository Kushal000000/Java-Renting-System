public class InstrumentToRent extends Instrument{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int numberOfDays;
    private boolean isRented;

    public InstrumentToRent(String instrumentName, int chargePerDay){

        super(instrumentName);
        // attribute=parameter

        this.chargePerDay = chargePerDay;
        this.dateOfRent ="";// empty 
        this.dateOfReturn = "";//empty
        this.numberOfDays = 0;
        this.isRented = false;
    }
    // getter logic
    public int getchargePerDay(){
        return this.chargePerDay;
    }
    public String getdateOfRent(){
        return this.dateOfRent;
    }
    public String getdateOfReturn(){
        return this.dateOfReturn;
    }
    public int getnumberOfDays(){
        return this.numberOfDays ;
    }
    public boolean getisRented(){
        return this.isRented;
    }
    
    // setter
    public void setchargePerDay(int chargePerDay){
        this.chargePerDay = chargePerDay;
    }
    public void setdateOfRent(String dateOfRent){
        this.dateOfRent = dateOfRent;
    }
    public void setdateOfReturn(String dateOfReturn){
        this.dateOfReturn = dateOfReturn;
    }
    public void setnumberOfDays(int numberOfDays){
        this.numberOfDays = numberOfDays;
    }
    public void setisRented(boolean isRented){
        this.isRented = isRented;
    }

    public void InstrumentToRent(String customerName, String customer_mobile_number, int customerPANnumber,String dateOfRent,
    String dateOfReturn, int numberOfDays){
           if(this.isRented == true){
            System.out.println("The Instrument is taken by:"+ super.getcustomerName()+" "+"Contact:" + super.getcustomer_mobile_number()
            +" "+"& will return by:"+this.numberOfDays);}
            else{
                super.setcustomerName(customerName);
                super.setcustomer_mobile_number(customer_mobile_number);
                super.setcustomerPANnumber(customerPANnumber);
                setdateOfRent(dateOfRent);
                setdateOfReturn(dateOfReturn);
                setnumberOfDays(numberOfDays);
                this.isRented = true;

                }

            float totalcharge = this.numberOfDays * this.chargePerDay;
            System.out.println("Total Charge is:"+ totalcharge);    
    }
    
    public void InstrumentToReturn(){
           if(this.isRented==false){
               System.out.println("The Instrument is not in Rent...You can Rent it");
           }
           else{
               super.setcustomerName("");
               super.setcustomer_mobile_number("");
               super.setcustomerPANnumber(0);
               setdateOfRent("");
               setnumberOfDays(0);
               isRented = false;
           }
    }



    public void display(){
        super.display();
        if(this.isRented == true){
            
            System.out.println("The Instrument is rented by:"+super.getcustomerName());
            System.out.println("Instrument was rented on:"+this.dateOfRent);
            System.out.println("Instrument will be returned on:"+this.dateOfReturn);
        }
        else{
            System.out.println("You can rent the Instrument. ThankYOU!!!!");
        }
    }    

}