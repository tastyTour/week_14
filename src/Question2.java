import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("경로 입력");
        String filePath = sc.nextLine();
        File file = new File(filePath);

        if(file.exists()) {
            System.out.println("파일 이름: " + file.getName());
            System.out.println("절대 주소: " + file.getAbsolutePath());
            System.out.println("파일 크기: " + file.length() + "bytes");
        }else{
            System.out.println("파일이 존재하지 않음");
        }
    }
}
