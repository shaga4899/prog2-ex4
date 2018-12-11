import java.io.*;

public class Stage {

    private int[][] position;
    private int[][] map;

    Stage()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("縦の長さ入力して");
        int tatte = Integer.parseInt(br.readLine());
    }
}
