
public class SutdaCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		// 자바에서 객체가 "+" 연산되거나 print() 메소드의 인자로 지정되면
		// 해당 객체의 toString() 메소드가 자동으로 실행된다.


		deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));


	}

}
