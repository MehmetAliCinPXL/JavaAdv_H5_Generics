package be.pxl.ja.oefening1;

public class WorkingPlace<T extends Vehicle & Motorized> {
//a) extends Motorized
//b) extends Vehicle
//c) extends Vehicle & Motorized

	private T thingToFix;
	private int numberOfThingsFixed = 0;

	public boolean isEmpty() {
		return thingToFix == null;
	}

	public void startFixing(T vehicle) {
		if (!isEmpty()) {
			System.out.println("Already busy.");
		} else {
			this.thingToFix = vehicle;
		}
	}

	public void finished() {
		thingToFix = null;
		numberOfThingsFixed++;
	}

	public int getNumberOfThingsFixed() {
		return numberOfThingsFixed;
	}




	public static void main(String[] args) {
		WorkingPlace<Car> dit = new WorkingPlace();

	}
}
