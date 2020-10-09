import java.util.*;
public class Rutinas {
	static String [] NomH={"Juan","Oscar","Miguel","Antonio","Lauro",
			"Eleodoro","Alberto","Jose"};
	static String [] NomM={"Maria","Guadalupe","Artemisa","Lorenia","Paola","Luisa",
			"Perla","Loreta"};
	static String [] Ap={"Garcia","Lopez","Perez","Rubio","Salazar","Hernandez"};
	
	   public static String nextNombre(int Cuantos, int Genero){
	    	// Genero 1=masculino 2=femenino, Cuantos cantidad de nombre primario
		    String Nom="",NomTra="";
	    	int Pos;
	    	Random R=new Random();
	    	for(int i=0 ; i<Cuantos ; i++){
	    		if (Genero==1){
	    			Pos=R.nextInt(NomH.length);
	    			NomTra=NomH[Pos];
	    			
	    		} else {
	    			Pos=R.nextInt(NomM.length);
	    			NomTra=NomM[Pos];
	    		}
	    		if(Nom.indexOf(NomTra)>=0){
	    			i--;
	    			continue;
	    		}
	    		Nom=Nom+" "+NomTra;
	    	}
	    	//Nom+=" "+Ap[R.nextInt(Ap.length)]+" "+Ap[R.nextInt(Ap.length)];
	    	
	    	return Nom.trim();
	    }
	   static public int nextInt(int Valor){
		   return new Random().nextInt(Valor);
	   }
	   static public int nextInt(int LimI, int LimS){
		   return new Random().nextInt(LimS-LimI+1)+LimI;
	   }
	   static public String PonBlancos(String Texto,int Tamaño){
		   while (Texto.length()<Tamaño)
			   Texto+=" ";
		   return Texto;
	   }
	   static public String PonCeros(int Numero,int Tamaño){
		   String Texto=Numero+"";
		   
		   while(Texto.length()<Tamaño)
			   Texto="0"+Texto;
		   return Texto;
		   
		   
	   }
}
