
abstract class Ship1 {
	public abstract int getPersonNumber();
	public abstract int getWeaponNumber();
	public abstract String getName();
}



class Boat extends Ship1{
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "보트";
	}
	@Override
	public int getPersonNumber(){
		// TODO Auto-generated method stub
		return 6;
	}
	@Override
	public int getWeaponNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
}


class Cruise extends Ship1{
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "전함무궁화";
	}
	@Override
	public int getPersonNumber(){
		// TODO Auto-generated method stub
		return 300;
	}
	@Override
	public int getWeaponNumber() {
		// TODO Auto-generated method stub
		return 200;
	}
}



class ShipUtil {
	public static void search(Ship1 ship) {
		System.out.println("이름 : " + ship.getName());
        System.out.println("사람수 : " + ship.getPersonNumber() + "명");
        System.out.println("무기수 : " + ship.getWeaponNumber() + "정");

	}
}


public class ShipMain {
    public static void main(String[] args) {
    	Ship1 boat = new Boat();
    	Ship1 cruise = new Cruise();
    	ShipUtil util = new ShipUtil();
        

        util.search(boat);
        util.search(cruise);
    }
}
