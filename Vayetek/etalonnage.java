import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class etalonnage {
    //créer une methode somme qui :
        //lit le fichier texte avec bufferreader pour utiliser la fonction readline 
        //qui lit ligne par ligne
        //utiliser try catch pour controller l'exception si le programme no trouve pas le fichier texte
        //utiliser while pour verifier l'existance de la ligne suivante
        //a chaque fois utiliser .readLine, le pointeur se deplace vers la ligne suivante
        //se deplacer a chaque character de la ligne, verifier si c'est un nombre : 
            //si oui, il est ajoutée a la chane numbersinline
            //Sinon, on passe au suivant
        //apres la fin de la ligne, on transforme la chaine numbersinline en int avec parseInt
        //et on l'ajoute à somme 
    public static long somme(String name){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(name))) {
            String line ;
            long somme = 0;
            while ((line=bufferedReader.readLine()) != null) {
                //line = buferedReader.readLine();
                //System.out.println("line: "+line);
                int l = line.length();
                String numbersinline= "";
                for(int i = 0 ; i<l ; i++){
                    //int n = line.charAt(i);
                    if(Character.isDigit(line.charAt(i))){
                        numbersinline += line.charAt(i);
                    }
                }
                somme += Integer.parseInt(numbersinline);
                
            }
            return somme ;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static void main(String[] args) {
        String name = "document.txt";
        System.out.println("la somme est : "+ somme(name));
    }
}
