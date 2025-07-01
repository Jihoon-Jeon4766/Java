class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			/*if(i < 10) {
				if(i == 0 || i == 2 || i == 7) {
					cards[i] = new SutdaCard(i + 1, true);
				}
				else {
				cards[i] = new SutdaCard(i + 1, false);
				}
			}
			else {
				cards[i] = new SutdaCard(i - 9, false);
			}*/
			cards[i] = new SutdaCard(i % 10 + 1, i == 0 || i == 2 || i == 7 ? true : false);

		}
	}
	
	void shuffle() {
		for (int i = 0; i < 100; i++) {
			int index = (int)(Math.random() * 19) + 1;
			
			SutdaCard temp = cards[0];
			
			cards[0] = cards[index];
			
			cards[index] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random() * 20);
		return cards[index];
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	// toString()
	// 객체의 정보를 문자열로 반환하는 메소드
	// 원래 Object 클래스에 정의된 메소드
	// Object 클래스는 자바의 모든 클래스의 부모 클래스
	// 자바에서 상속받은 메소드는 자기 자신클래스에 맞도록 재정의해서 사용할 수 있다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}