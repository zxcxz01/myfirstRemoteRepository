package basic4;

public class Car {

	// 필
	String company = "HD";
	String model;
	String color;
	int maxSpeed;

	public Car() {
		
	}
	
	// 생성자 간의 중복된 코드 발생 -> 공통 코드를 한 생성자에만 집중적으로 작성하고,
	// 나머지 생성자는 this()를 사용하여 공통 코드를 가지고 있는 생성자를 호출하는 방법으로 개선
	
	public Car(String model) {
//		this();
		this(model, 250, "은색");
	}
	
	public Car(String model, String color) {
		this(model,300,color);
	}
	
	
	public Car(String model, int maxSpeed, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 메서드
}
