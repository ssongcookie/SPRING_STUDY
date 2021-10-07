package study1007;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Wheel wheel;//wheel을 속성으로 갖기
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Wheel wheel) {
		super();
		this.wheel = wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + "]";
	}
}
