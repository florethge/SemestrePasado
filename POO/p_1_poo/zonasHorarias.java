public class zonasHorarias{
	private clock[] zonashorarias;
	
	public zonasHorarias(){
		this.zonasHorarias = new clock[10];
	}
	
	//public void establecerHora(this.cd,zonasHorarias[],zonasHorarias.PrintTime){	
	//}
	
	public void establecerHora(int pos, String cd, int hr, int min, int sec){
		//this.zonasHorarias[pos]=new Clock (cd,hr,min,sec);
		
		if (this.zonasHorarias[pos]==null){
		clock tmp =new Clock (cd,hr,min,sec);
		this.zonasHorarias[pos]= tmp;
		}
		else{
			this.zonasHorarias[pos].setTime(hr,min,sec);
			this.zonasHorarias[pos].setCiudad(cd);
		}
	}

	public void imprimeZonasHorarias(){
		for(int i=0;i<this.zonasHorarias.length;i++){
			if(this.zonasHorarias[i]!=null){
				this.zonasHorarias[i].printTime();
				// ***TAREA: System.out.println(this.zonasHorarias[i]);
			}
		}
	}

	public void horarioVerano(){
		for(int i=0;i<this.zonasHorarias.length;i++){
                        if(this.zonasHorarias[i]!=null){
                                this.zonasHorarias[i].incrementHours();
                        }

	}
	
	public static void main(String[] args){
		zonasHorarias zh= new zonasHorarias();
		zh.establecerHora(0,"Guadalajara",12,13,5);
		zh.establecerHora(1,"Tokio",3,13,5);
		zh.establecerHora(2,"Dubai",22,13,5);
		zh.establecerHora(3,"Las Vegas",10,13,5);
		zh.establecerHora(9,"Berlín",19,13,5);

		//zh.imprimeZonasHorarias();
		//System.out.println();
		//zh.horarioVerano();
		
	}
	
}
