package be.pxl.ja.oefening1;

public class WorkingPlaceUtility {

	public static <T extends Vehicle & Motorized> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}

	public static void main(String[] args) {
		WorkingPlace<Car> obj = new WorkingPlace();
		obj.finished();
		System.out.println(getScore(obj));
	}
}

/*
a) public static <T extends Bike> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
	en in Wrokingplace ervoor zorgen dat bike ook gaat

b) public static <T extends Vehicle> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
c) Huidig code

*/
