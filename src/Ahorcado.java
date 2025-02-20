import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        int intentosMaximos = 10;
        int intentos = 0;
        String palabraSecreta = "inteligencia";
        boolean isAdivined = false;
        Scanner teclado = new Scanner(System.in);
        char[] letras = new char[palabraSecreta.length()];
        for(int i = 0; i<letras.length; i++){
            letras[i] = '_';
        }

        System.out.println("La palabra a adivinar tiene " + palabraSecreta.length() + " letras");
        while(!isAdivined && intentos<intentosMaximos){
            
            System.out.println("Ingresa una letra");
            System.out.println(letras);
            char primeraLetra = teclado.next().charAt(0);
            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == primeraLetra){
                    letras[i] = primeraLetra;
                    letraCorrecta = true;
                }
            }
       
      
            if(!letraCorrecta){
                intentos++;
                System.out.println("letra incorrecta te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letras).equals(palabraSecreta)){
                isAdivined = true;
                System.out.println("felicidades has ganado! la palabra era " + palabraSecreta);

            }
}
            if(!isAdivined){
                System.out.println("has perdido! te quedaste sin intentos!, la palabra era: " + palabraSecreta);
            }
         
    
           
    }
}
