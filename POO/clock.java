 public class clock{
	
	private int hr;
	
	private int min;
	
	private int sec;
	
	
	private String ciu;	

	
	
	public clock(){
		
		//this(12,0,0);
		
		hr=12;
		
		min=0;
		
		sec=0;
		
		ciu= "gdl"
;	
	}

	
	
	public clock(String cd, int h, int m, int s){
		
		//setTime(hr,min,sec);
		
		hr= h;
		
		min= m;
		
		sec= s;
		
		ciu=cd;
	
	
	}


	public clock(int h, int m, int s){
		
		//setTime(hr,min,sec);
		
		hr= h;
		
		min= m;
		
		sec= s;
		
		ciu="";
	
	
	}




		
	public void setTime(int hr, int min, int sec){
		
		if(hr>=0 && hr<24){
			
			
			this.hr=hr;
		
		}
else{
			
			this.hr=12;
		
		}


		
		if(min>=0 && min<60){
                       
			this.min=min;
                
		}
else{
                        
			this.min=0;
                
		}

		

		if(sec>=0 && sec<60){
                        
			this.sec=sec;
                
		}
else{
                        
			this.sec=0;
                
		}

	
	}

	
	
	public void setCiudad(String cd){

		this.ciu=cd;
	
	}

	
	public int getHours(){

		return hr;

	}



	public int getMinutes(){

                return min;

        }



	public int getSeconds(){

                return sec;

        }



	public String getCiudad(){

                return ciu;

        }



	public void printTime(){

		String sHr;
		 // = this.hr<10?"0"+this.hr:""+this.hr;
		String sMin; //= this.min<10?"0"+this.min:""+this.min;

		String sSec; //= this.sec<10?"0"+this.sec:""+this.sec;



		if (this.hr<10){

			sHr="0"+this.hr;

		}
else{

			sHr=""+this.hr;

		}

		System.out.println("La hora en "+this.ciu+" "+hr+":"+min+":"+sec);

	}



	public int incrementHours(){

		//this.hr=(this.hr++)%24; referencia a un atributo

		if(hr == 23){

			hr=0;

		}else{

			hr++;

		}

		return hr;

	}


	
public int incrementMinutes(){

		//this.min=(this.min+1)%60;

		//if(this.min==0){

			//this.incrementHours();

		//}

                if(min == 59){

                        min=0;

                }else{

                        min++;

                }

		return min;

        }



	public int incrementSeconds(){

                if(sec == 59){

                        sec=0;

                }else{

                        sec++;

                }

		return sec;

        }



	public boolean equals(clock c){

		//return....

		if(hr == c.getHours() && min ==c.getMinutes() && sec == c.getSeconds()){

			return true;

		}

		return false;

	}



	public void makeCopy(clock b){
		hr  = b.getHours();

		min = b.getMinutes();

		sec = b.getSeconds();

	}



	public clock getCopy(){

		//return new clock(this.hr, this.min, this.sec);

		clock nuevo = new clock(hr,min,sec);

		return nuevo;

	}



}
