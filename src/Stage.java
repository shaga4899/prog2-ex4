import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stage {

    private int[][] position;
    private int[][] map;

    Stage(){
        try {
            File file = new File("maze_data/map.txt");
            FileReader filereader = new FileReader(file);
            int ch;
            int out_data = -1;
            String[] x;
            x =new String[4];
            while((ch = filereader.read()) != -1){
                out_data = ch;
            }
            filereader.close();
            System.out.println(out_data);

        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
