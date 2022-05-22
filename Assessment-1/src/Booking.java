
public class Booking {
	String customerEmail;
	int seatsRequired;
	boolean isBooked;
	static int seatsAvailable;
	
	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public int getSeatsRequired() {
		return seatsRequired;
	}


	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}


	public boolean isBooked() {
		return isBooked;
	}


	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}


	public static int getSeatsAvailable() {
		return seatsAvailable;
	}


	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}


	Booking(String customerEmail,int seatsRequired){
		this.customerEmail=customerEmail;
		this.seatsRequired=seatsRequired;
	}
	
	static {
        seatsAvailable=400;
	}
	void checking()
	{
       if(seatsAvailable>seatsRequired) {
    	   isBooked=true;
    	   seatsAvailable=seatsAvailable-  seatsRequired;
    	   System.out.println("seats are booked:" + seatsRequired);
    	   System.out.println("seats is booked with :" + customerEmail);
    	   System.out.println("Remaining seats are:" + seatsAvailable);
       }
       else {
    	   isBooked=false;
    	   System.out.println("seats are not available");    	   
       }
	}

	public static void main(String[] args) {
      Booking b=new Booking("h@gmail.com",56);
      b.checking();

	}

}
