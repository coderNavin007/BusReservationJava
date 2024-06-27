package busReservation;

public class Bus {
private int busNumber;
private boolean ac;
private int capacity;
	


//GETTERS AND SETTERS
public int getBusNumber() {return busNumber;}
//public void setBusNumber(int busNumber) {
//	this.busNumber = busNumber;
//}
public int getCapacity() {
	return capacity;
}
public boolean isAc() {return ac;}
public void setAc(boolean val) {ac = val;}
public void setCapacity(int capacity) {this.capacity = capacity;}


void displayBusNumber() {
	System.out.println("BusNumber: " + busNumber + "\t" + "AC: " + ac + "\t" + "Capacity: " + capacity);
}

//CONSTRUCTORS
	Bus(int num,boolean ac,int cap){
		this.busNumber=num;
		this.ac=ac;
		this.capacity=cap;
		
	}
	
	
	
}
