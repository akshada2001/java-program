
public class sample {
	 public enum direction{East,West,North,South};
     
     
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         for(direction d:direction.values())
	         {
	        	 System.out.println(d);
	         }
	         System.out.println(direction.valueOf("North").ordinal());
		}

	}

