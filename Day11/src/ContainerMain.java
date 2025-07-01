
public class ContainerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> strContainer = new Container<String>();
        strContainer.set("홍길동");
        String str = strContainer.get();
        System.out.println("str = " + str);

        Container<Integer> intContainer = new Container<Integer>();
        intContainer.set(6);
        int value = intContainer.get();
        System.out.println("value = " + value);
    }

}
