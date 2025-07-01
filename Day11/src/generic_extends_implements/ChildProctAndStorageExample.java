package generic_extends_implements;

import multi_type_parameter.Tv;

public class ChildProctAndStorageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");
		
		Tv tv = product.getKind();
		String model = product.getModel();
		String company = product.getCompany();

		System.out.println("tv= "+ tv);
		System.out.println("model= "+ model);
		System.out.println("company= "+ company);
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		tv = storage.get(0);
		
		System.out.println("tv= " + tv);
	}
	

}
