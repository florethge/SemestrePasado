import java.util.*;
public class baraja{
	private naipe[] cartas;

	public baraja(){
		this.cartas= new naipe[52];
		for(int i=0; i<4; i++){
			for (int j=0; j<13;j++){
				this.cartas[c]= new naipe(1,j);
				c++;
			}
		}
	}

	public String toString(){
		String res="";
		for(int i=0; i<this.cartas.length; i++){
			res+=this.cartas[i].toString()+"\n";
		}
		return res;
	}

	public void mezclar(){
		Random ran= new Random();
		//System.out.println(ran.nextInt(52));
		naipe tmp;
		aleatorio= ran.nextInt(52);
		tmp=this.cartas[i];
		this.cartas[i]=this.cartas[aleatorio];
		this.cartas[aleatorio]=tmp;
	}
}
