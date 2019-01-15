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
            filereader.close();
            

        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
