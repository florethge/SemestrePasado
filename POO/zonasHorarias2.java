public class zonasHorarias2{
        private clock [] zonasHorarias;

        public zonasHorarias2(){
                this.zonasHorarias = new clock [10];
        }

        //public void establecerHora(this.cd,zonasHorarias[],zonasHorarias.PrintTime){
        //}

        public void establecerHora(int pos, String cd, int hr, int min, int sec){
                //this.zonasHorarias[pos]=new clock (cd,hr,min,sec);
		
                if (this.zonasHorarias[pos]==null){
                	clock tmp =new clock (cd,hr,min,sec);
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
				String hora = Integer.toString(this.zonasHorarias[i].getHours());
				String minutos = Integer.toString(this.zonasHorarias[i].getMinutes());
				String segundos = Integer.toString(this.zonasHorarias[i].getSeconds());
				String ciudad = this.zonasHorarias[i].getCiudad();
				System.out.println("La hora en "+ ciudad +" "+hora+":"+minutos+":"+segundos);
				
                        }
                }
        }

        public void horarioVerano(){
                for(int i=0;i<this.zonasHorarias.length;i++){
                        if(this.zonasHorarias[i]!=null){
                                this.zonasHorarias[i].incrementHours();
                        }

        	}
	}

	public static void main(String[] args){
                zonasHorarias2 zh= new zonasHorarias2();
                zh.establecerHora(0,"Guadalajara",12,13,5);
                zh.establecerHora(1,"Tokio",3,13,5);
                zh.establecerHora(2,"Dubai",22,13,5);
                zh.establecerHora(3,"Las Vegas",10,13,5);
                zh.establecerHora(9,"Berlín",19,13,5);

                zh.imprimeZonasHorarias();
                //System.out.println();
                //zh.horarioVerano();

        }
}