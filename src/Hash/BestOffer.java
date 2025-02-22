package Hash;
import java.util.Scanner;
import java.util.HashMap;


public class BestOffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        HashMap<String, String> mapa= new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String data = line.substring(0,10);
            String offer = line.substring(11);
            if(mapa.containsKey(data)) {
                String[] ima = mapa.get(data).split("\\s+");
                String[] nova = offer.split("\\s+");
                if(Integer.parseInt(ima[2]) < Integer.parseInt(nova[2])){
                    mapa.put(data, offer);
                }
            }
            else {
                mapa.put(data, offer);
            }
        }
        String datum = input.nextLine();
        if(mapa.containsKey(datum)) {
            System.out.println(mapa.get(datum));
        }
        else {
            System.out.println("No offers");
        }
    }
}
