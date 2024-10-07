package Encapsulation;

public class student {

		private int stid;
		private String stname;
		int id;
		
		public int getStid() {
			return stid;
		}
		
		public void setStid(int stid) {
			if(stid > 0 )
			this.stid = stid;
			else
				System.out.println("Student id must be positive");
		}
		
		public String getStname() {
			return stname;
		}
		
		public void setStname(String stname) {
			this.stname = stname;
		}
		
	}
