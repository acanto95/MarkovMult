import java.util.*;
public class MatPow{
	public Fraccion[][] matPow(Fraccion[][] fraccion1, Fraccion[][] fraccion2){
    	Fraccion[][] result = new Fraccion[fraccion1.length][fraccion1.length];
		Fraccion sum = new Fraccion(1,1);
		Fraccion zero = new Fraccion(0,0);
		

		for (int i = 0; i < fraccion1.length; i++) { 
    				for (int j = 0; j < fraccion2[0].length; j++) { 
        				for (int k = 0; k < fraccion1[0].length; k++) { 
        					Fraccion aux = fraccion1[i][k].multiplicate(fraccion2[k][j]);  //Multiplicacion de fracciones
        					//if(aux.num == 0 || aux.den == 0)  //si encuentra una fraccion 0, la ignora
        					//continue;

        					if(k<1)
            					sum = aux;
            				
        					else
        						sum = sum.sumer(aux);
        						result[i][j] = sum;

            				
        				}

        				
    				}
				}

					for(int i = 0;i<result.length;i++){
						for(int j = 0;j<result.length;j++){

						result[i][j]= result[i][j].simplify(result[i][j]); // simplificacion de resultados
			}
		}

		




				for (int i = 0; i < result.length; i++) {
		    for (int j = 0; j < result[i].length; j++) {
		        System.out.print(result[i][j].returnNumC() + "/" + result[i][j].returnDenC() + " "); //Se imprime la matriz resusltante
		    }

        System.out.println();
    		
		}
  System.out.println("\n");
  
		
		return result;
    }
    public Fraccion[][] matPowsinPrint(Fraccion[][] fraccion1, Fraccion[][] fraccion2){
      Fraccion[][] result = new Fraccion[fraccion1.length][fraccion1.length];
    Fraccion sum = new Fraccion(1,1);
    Fraccion zero = new Fraccion(0,0);
    

    for (int i = 0; i < fraccion1.length; i++) { 
            for (int j = 0; j < fraccion2[0].length; j++) { 
                for (int k = 0; k < fraccion1[0].length; k++) { 
                  Fraccion aux = fraccion1[i][k].multiplicate(fraccion2[k][j]);  //Multiplicacion de fracciones
                  //if(aux.num == 0 || aux.den == 0)  //si encuentra una fraccion 0, la ignora
                  //continue;

                  if(k<1)
                      sum = aux;
                    
                  else
                    sum = sum.sumer(aux);
                    result[i][j] = sum;

                    
                }

                
            }
        }

          for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result.length;j++){

            result[i][j]= result[i][j].simplify(result[i][j]); // simplificacion de resultados
      }
    }

    
    return result;
    }


    public boolean comparator(Fraccion[][]result){
      double num1,num2,den1,den2;
      for(int j = 0; j<result.length;j++){
        for(int i =0 ;i<result.length-1;i++){
          
          num1 = result[i][j].returnNum();
          num2 = result[i+1][j].returnNum();
          den1 = result[i][j].returnNum();
          den2 = result[i+1][j].returnNum();

          if(num1 != num2 && den1 !=den2)
            return false;
          

        }

      }
      
      return true;
    }

    public double[][] toDecimal(Fraccion[][] result){
    	double[][] decimals = new double[result.length][result.length];
    	for(int i = 0;i<result.length;i++){
			for(int j = 0;j<result.length;j++){
				decimals[i][j] = result[i][j].returnVal();
			
			}
		}
		return decimals;
    }
}