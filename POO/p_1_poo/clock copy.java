 public class clock{
	private int hr;
	private int min;
	private int sec;
	
	public clock(){
		hr=12;
		min=0;
		sec=0;
	}
	
	public clock(int h, int m, int s){
		hr= h;
		min= m;
		sec= s;
	}

	public void setTime(int h, int m, int s){
		if(h>=0 && h<24){
			hr=h;
		}
		else{
			hr=12;
		}

		hr=h;
		min=m;
		sec=s;
	}
	
	public int getHours(){
		
	}

	public void printTime(){
		System.out.println(hr+":"+min+":"+sec);
	}
	
		



}
