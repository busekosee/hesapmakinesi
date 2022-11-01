
public class türevinteagral {
	public void türev(int n,int üs) {
		
		System.out.println("f(x)="+n+"*x^"+üs);
		System.out.println("türevi:");
		System.out.println("f(x):"+n*üs+"*x^"+(üs-1));
		
	}
	public void integral(float n,int üs) {
		System.out.println("F(x)="+n+"*x^"+üs);
		System.out.println("integrali:");
		System.out.println("f(x):"+n/(üs+1)+"*x^"+(üs+1));
		
	}

}
