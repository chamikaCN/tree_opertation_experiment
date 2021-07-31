import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Helper {

    String commonPath = "F:\\Engineering\\Modules\\Semester 7\\Advanced Algorithms\\Asignment 1\\Assignment 1 project\\src\\";

    public ArrayList<Long> readFile(String operation, int set, int data) {

        BufferedReader bufReader = null;
        ArrayList<Long> Values = new ArrayList<>();
        try {
            bufReader = new BufferedReader(new FileReader(commonPath + operation + "\\set" + String.valueOf(set) + "\\data_" + String.valueOf(data) + ".txt"));
            String line = bufReader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                for (String m:s) {
                    Values.add(Long.parseLong(m));
                }
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Values;

    }
}
