import java.io.*;
import java.util.Arrays;


public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(" ");
            String word = split[0];
            String anagram = split[1];

        }
        reader.close();
    }
    private static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
