import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Streams();
        long endTime = System.currentTimeMillis();
        System.out.println("스트림 시간: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        BufferedStreams();
        endTime = System.currentTimeMillis();
        System.out.println("버퍼스트림 시간: " + (endTime - startTime) + " ms");
    }

    private static void Streams() {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void BufferedStreams() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"))) {
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
