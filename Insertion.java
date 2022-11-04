package sort;

public class Insertion {

	
		public static void main(String[] args) {
			int[] v = {4, 7, 1, 9, 3, 0};
			ordena(v, 0);
			for(int i  = 0; i < v.length; i++){
			    System.out.print(v[i] + " ");
			}
		}
		public static void ordena(int[] v, int i) {
		    if(i == v.length)
		        return;
		        
		    for(int c = i; c > 0; c--){
		        if(v[c-1] > v[c]){
		            int aux = v[c-1];
		            v[c-1] = v[c];
		            v[c] = aux;
		        }
		    }
		    ordena(v, ++i);
		    
		}


	}


