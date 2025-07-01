
public sealed class SealedClassTest permits A,B{

}

// 이 클래스는 상속받을 수 없는 클래스로 지정
final class A extends SealedClassTest{
	
}
// final 클래스 상속X
/*class D extends A{ 
	
}*/

// 다른 클래스들이 B 클래스를 상속할 수 있게 처리
non-sealed class B extends SealedClassTest{
	
}

class C extends B{
	
}