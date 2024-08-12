package tire;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		//타이어 펑크 여부 판단
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명 : "
				+(maxRotation - accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
