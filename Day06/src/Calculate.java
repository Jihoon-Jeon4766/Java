public class Calculate {
	int getFactorial(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	int getPower(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i * i;
		}
		return sum;
	}

}