package Files;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("C:\\Users\\vijay\\IdeaProjects\\DataStructures\\src\\Files\\input.txt");
             FileOutputStream out = new FileOutputStream("C:\\Users\\vijay\\IdeaProjects\\DataStructures\\src\\Files\\output.txt")) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
