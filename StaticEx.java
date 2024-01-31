public class StaticEx {

      //static function can access only static variables

	//non static function can access both static and non static variables

	//static function and variables are object independent

     int i=6;

     static int j=13;

     void show()

     {

    	 System.out.println(i+" "+j);

     }
    public static void main(String[] args) {

		StaticEx se=new StaticEx();

		StaticEx se2=new StaticEx();

		se.i++;

		se.j++;

	System.out.println(se.i);//non static
	System.out.println(se2.i);

    System.out.println(se.j);

    System.out.println(se2.j);
    }
}
	

