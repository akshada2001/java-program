
class BaseClass
{
	int a=89;
	void show()
	{
		System.out.println("Show - base");
	}
}
public class SuperEx extends BaseClass{
	int a=15;
	void show()
	{
		super.show();//base class method called
		//System.out.println("Show - derived");
		System.out.println(super.a);//base class value print
	}

	public static void main(String[] args) {
		SuperEx s=new SuperEx();
		
		s.show();

	}

}