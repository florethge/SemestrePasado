public class PruebaArreglos{
	public int suma(int[] valores){
		int total=0;
		for(int i=0;i<valores.length;i++){
			total=total+valores[i];
		}
		return total;
	}
	
	public int maximo (int [] valores){
		int max=valores[0];
		for (int i=0; i<valores.length; i++){
			if (valores[i]>max){
				max=valores[i];
			}
		}
		return max;
	}

	public int minimo (int [] valores){
		int min=valores[0];
		for (int i=0; i<valores.length; i++){
			if (valores[i]<min){
				min= valores[i];
			}
		}
		return min;
	}

	public double promedio (int [] valores){
		double prom=suma(valores)/valores.length;
		return prom;
	}

	public void imprime (String [][] valores){
		String fila = "";
		for(int i=0;i<valores.length; i++){
			for (int j=0;j<valores[i].length; j++){
				fila = fila +" "+ valores[i][j];
			}
			System.out.println(fila);
			fila = "";
		}
	}

	public static void main(String[] args){
		int[] a={2,4,7,11,24,33};
		PruebaArreglos pa= new PruebaArreglos();
		System.out.println("El total de suma  es: "+pa.suma(a));
		System.out.println("El minimo es: "+pa.minimo(a));
		System.out.println("El maximo es: "+pa.maximo(a));
		System.out.println("El promedio es: "+pa.promedio(a));


		//Agarramos los parametros de filas y columnas del args
		int filas =Integer.parseInt(args[0]);
		int colu= Integer.parseInt(args[1]);
		
		//Creamos el arreglo con esas filas y columnas
		String [][] c = new String [filas][colu];
		
		//Iniciamos el contador de parametros en 2 porque ya usamos los primeros para filas y columnas
		int contador = 2;
		

		//Recorremos el arreglo y ponemos los parametros de args en cada posicion
		for(int i =0;i<filas;i++){
			for(int j =0;j<colu;j++){
				c[i][j]=args[contador];
				contador++;
			}
		}
		pa.imprime(c);
	}
}
