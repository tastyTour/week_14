import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("img.jpg");
             FileOutputStream fos = new FileOutputStream("2.jpg")) {

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
                fos.write(data);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}