package Hash;

import java.util.HashMap;
import java.util.Scanner;

class Ime {
    char pol;
    String ime;
    int pojavuvanja;
}

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        HashMap<String, PozNeg> mapa = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split(" ");
        }
    }
}
