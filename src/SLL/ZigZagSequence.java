package SLL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZigZagSequence {

    static int najdiNajdolgaCikCak(int []a) {
        int cikcak = 1;
        int maxCikcak = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] < 0 && a[i + 1] > 0) || (a[i] > 0 && a[i + 1] < 0)) {
                cikcak++;
            } else {
                maxCikcak = Math.max(maxCikcak, cikcak);
                cikcak = 1;
            }
        }
        maxCikcak = Math.max(maxCikcak, cikcak);

        return maxCikcak;
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        for (i=0;i<N;i++)
            a[i] = Integer.parseInt(br.readLine());

        int rez = najdiNajdolgaCikCak(a);
        System.out.println(rez);

        br.close();

    }

}
