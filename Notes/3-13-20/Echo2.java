import java.io.*;

class Echo2 {
    public static void main(String[] args) {
        try {

            // read from a text file
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            // write to a text file
            FileWriter fw = new FileWriter("output.txt");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                fw.write(line + "\n");

            }
            br.close();
            fw.close();
        } catch (Exception e) {

        }
    }
}