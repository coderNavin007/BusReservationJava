package busReservation;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNumber;
	Date date;
	Scanner sc=new Scanner(System.in);

	Booking(){
//		this.passengerName=passName;
//		this.busNumber=busNo;
//		this.date=date;
		System.out.println("Enter Passenger Name: ");
		passengerName=sc.next();
		
		System.out.println("Enter Bus Number: ");
		busNumber=sc.nextInt();
		
		System.out.println("Enter the Date of travel (dd/mm/yyyy): ");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking>book, ArrayList<Bus>buses) {
		
		int capacity=0;
		int booked=0;
		for(Bus bus : buses) {
			if(bus.getBusNumber()==busNumber)
				capacity=bus.getCapacity();
		}
		for(Booking b : book) {
			if(b.busNumber == busNumber && b.date.equals(date))
				booked++;
		}
		
		return booked<capacity?true:false;
	}

}
