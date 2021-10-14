class A{
	int i;
	int j;
}

class B extends A{ //extends:확장하다
	int k;
}

class InheritanceTest
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.i=10;
		ob.j=20;
		ob.k=30;
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.k);
	}
}
