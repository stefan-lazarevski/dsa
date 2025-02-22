package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Rodenden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        HashMap<Integer, Integer> mapa= new HashMap<>();
        for (int i=0; i<n; i++){
            String line=input.nextLine();
            System.out.println(line);
            String[] parts= line.split("\\.");
            if ( mapa.containsKey(Integer.parseInt(parts[1]))){
                mapa.put(Integer.parseInt(parts[1]), mapa.get(Integer.parseInt(parts[1]))+1);
            }
            else {
                mapa.put(Integer.parseInt(parts[1]),1);
            }
        }
        int mesec= input.nextInt();
        if ( mapa.containsKey(mesec) ){
            System.out.println(mapa.get(mesec));
        }
        else System.out.println("Empty");
    }

}