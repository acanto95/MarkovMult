import java.util.*;
public class Markov{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		Fraccion x = new Fraccion(0,0);
		Fraccion y = new Fraccion(0,0);
		int n = c.nextInt();
		int iter = 0;
		boolean norm = false;
		boolean flag = false;
		ArrayList<Fraccion> vector = new ArrayList<Fraccion>();
	

		Fraccion[][] fracciones = new Fraccion[n][n];
		Fraccion[][] result = new Fraccion[n][n];
		Fraccion[][] first = new Fraccion[n][n];
		double[][] decimals = new double[n][n];
		MatPow power = new MatPow();

		for(int i = 0;i<fracciones.length;i++){
			for(int j = 0;j<fracciones.length;j++){
				int num = c.nextInt();
				int den = c.nextInt();
				
				Fraccion newfracc = new Fraccion(num,den);
				fracciones[i][j] = newfracc;
			}
		}
		iter = c.nextInt();

		for (int i = 0; i < fracciones.length; i++) { //se imprime la primera matriz
		    for (int j = 0; j < fracciones[i].length; j++) {
		        System.out.print(fracciones[i][j].returnNumC() + "/" + fracciones[i][j].returnDenC() + " "); //Se imprime la matriz resusltante
		    }

        System.out.println();
    		
		}
  System.out.println("\n");
		


			

		for(int i = 0;i<iter-1;i++){
			if(i==0)
				result = power.matPow(fracciones,fracciones);  //resultado de elevar la matriz a la n
			else
				result = power.matPow(result,fracciones);
		
		}
		System.out.println("calculando vector.....");


			
   

		long startTime = System.currentTimeMillis(); //fetch starting time
		while(norm != true){
		
				result = power.matPowsinPrint(result,fracciones); //calculo vector
				norm = power.comparator(result);


				
			if(false||(System.currentTimeMillis()-startTime)>25000){//Loop para calcular el tiempo
			    System.out.println("parece no hay resultado");
			    System.exit(0);
			}
							
					}



	


		for(int j = 0;j<result.length;j++){ //Array para imprimir vector
			vector.add(result[0][j]);

		}

		System.out.println("vector de punto fjio: "+ vector);
	


		



		





		/*for(int i = 0;i<fracciones.length;i++){
			for(int j = 0;j<fracciones.length;j++){
				System.out.println(fracciones[i][j].returnNum() + "/" + fracciones[i][j].returnDen());
			}
		}
		*/

			
        
       /*for (int i = 0; i < fracciones.length; i++) {
    		result [i] = new Fraccion[fracciones[i].length];
   			 for (int j = 0; j < fracciones[i].length; j++) {
        			Fraccion sum = new Fraccion(1,1);
        			for (int l = 0; l < fracciones.length; l++) {
        				Fraccion aux = fracciones[i][l].multiplicate(fracciones[l][j]);
        				if(i<1 && j<1 && l<1)
            			sum = aux;
            			else
            			sum = sum.sumer(aux);
        		}
        		result[i][j] = sum ;
    		}
				}
				*/

      



	


	}
}