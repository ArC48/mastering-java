package lecture5.examples;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOExample {

    public static void main(String[] args) {
        FileOutputStream fout = null;
        DataOutputStream dout = null;

        try {
            fout = new FileOutputStream("test.txt");
            dout = new DataOutputStream(fout);
            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('4');
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fout != null) fout.close();
                if (dout != null) dout.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


        try (var din = new DataInputStream(new FileInputStream("test.txt"))) {
            System.out.println(din.readDouble());
            System.out.println(din.readInt());
            System.out.println(din.readBoolean());
            System.out.println(din.readChar());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try (var out = new PrintWriter("hello.txt", StandardCharsets.UTF_8)) {
            out.print("Hello ");
            out.print("World!");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        int ch;
        try (var fin = new FileReader("hello.txt", StandardCharsets.UTF_8)) {
            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            List<String> strings = Files.readAllLines(Paths.get("hello.txt"), StandardCharsets.UTF_8);
            strings.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
