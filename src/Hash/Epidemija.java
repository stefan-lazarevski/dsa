package Hash;

import java.util.HashMap;
import java.util.Scanner;

class PozNeg{
    int pozitivni = 0;
    int negativni = 0;

    public double rizik (){
        return (double) pozitivni / (pozitivni + negativni);
    }
}

public class Epidemija {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        HashMap<String, PozNeg> mapa = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split(" ");
            mapa.putIfAbsent(parts[0], new PozNeg());
            if(parts[2].equals("positive"))
                mapa.get(parts[0]).pozitivni++;
            else
                mapa.get(parts[0]).negativni++;
        }
        String grad = input.nextLine();
        System.out.println(mapa.get(grad).rizik());
    }
}
