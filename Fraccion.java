import java.util.*;
public class Fraccion{
	double num;
	double den;
	double val;
	public Fraccion(double a, double b){
		 num = a;
		 den = b;
		 if(a== 0 || b== 0)
		 	val = 0;
		 else
		 val = a/b;


	}

	public double returnNum(){
		return this.num;
	}
	public int returnNumC(){
		double newnum1 = this.num;
		return (int)newnum1;
	}


	public double returnDen(){
		return this.den;
	}

	public int returnDenC(){
		double newnum2 = this.den;
		return (int)newnum2;
	}
	public double returnVal(){
		 double newval = num/den;
		return newval;
	}

	Fraccion sumer(Fraccion otra){

		if(otra.num ==0 && otra.den ==0 ){
			return new Fraccion(num,den);
		}
		else if(num== 0 && den ==0){
			return new Fraccion(otra.num,otra.den);
		}
        double nn = num * otra.den + den * otra.num;
        double nd = den * otra.den;
        return new Fraccion(nn, nd);
    }

    public static double mincom(double a, double b) {
    return b == 0 ? a : mincom(b, a % b);
    }


    Fraccion simplify(Fraccion otra) {
    	
    double mincom = mincom(otra.num, otra.den);
    return new Fraccion((otra.num / mincom),(otra.den / mincom) );
        }

	Fraccion multiplicate(Fraccion otra){
        double nn = num * otra.num;
        double nd = den * otra.den;
        return new Fraccion(nn, nd);
    }

    public String toString(){
            return ((int)num + "/" + (int)den );
        }

    




}