import java.util.Scanner;

interface Speed { 
	int speed = 10;
	void upSpeed(int inc);
	void downSpeed(int dec);
	void stop();
}

interface Display {
	void disp();
}

class Cars implements Speed, Display{
	int inputVelocity;
	int velocity = Speed.speed;

	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("속도를 입력하세요: ");
		inputVelocity = scanner.nextInt();
		if(inputVelocity >= 0) {
			upSpeed(inputVelocity);
		}
		else {
			downSpeed(inputVelocity);
		}
		if(velocity > 0) {
			disp();
		}
		else {
			stop();
		}
	}

	@Override
	public void upSpeed(int inc) {
		// TODO Auto-generated method stub
		velocity += inc;
	}

	@Override
	public void downSpeed(int dec) {
		// TODO Auto-generated method stub
		velocity += dec;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지하였습니다.");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
			System.out.println("현재속도는 " + velocity + "km/h 입니다.");
	}
}

public class WorkShop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars car = new Cars();
		
		while(car.velocity > 0) {
			car.input();
		}
	}

}
