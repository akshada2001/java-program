
public class ThreadEx extends Thread {
	static int i=4;
	public void run()
	{
		i++;
	}

	public static void main(String[] args) {

       ThreadEx te = new ThreadEx();
       te.start();
      /* while(te.isAlive())
       {
    	   System.out.println("loading....");
       }*/
       System.out.println("1st:"+i);
       i++;
       System.out.println("1st:"+i);

	}

}

