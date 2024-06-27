package busReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bus bus[] =new Bus[50];
		ArrayList<Bus> buses =new ArrayList<Bus>();
		ArrayList<Booking> book = new ArrayList<Booking>();
		
		
		
		
		
		
		buses.add(new Bus(1,true,3));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,false,30));
		buses.add(new Bus(4,true,39));
		buses.add(new Bus(5,false,20));
		buses.add(new Bus(6,false,23));
		buses.add(new Bus(7,true,25));
		buses.add(new Bus(8,true,42));
		int userOption=1;
		Scanner sc=new Scanner(System.in);
		
		for(Bus b : buses) {
			b.displayBusNumber();
		}
		
		while(userOption==1) {
			System.out.println("Press 1 for Booking OR Press 2 for Exit");
			userOption=sc.nextInt();
			if(userOption==1) {
				//System.out.println("Booking.....");
				Booking booking=new Booking();
				if(booking.isAvailable(book,buses)) {
					book.add(booking);
					System.out.println("Your Booking is CONFIRMED");
				}
				else {
					System.out.println("Sorry Your Booking is on Waiting List, Either you can wait or try another Bus");
				}
				
			}
			
			
		}
		

	}

}
