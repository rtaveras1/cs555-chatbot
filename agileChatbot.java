import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Hello, I am the cs555 Chatbot. You can ask me about any terminology regarding Agile Methodologies!");
       String input = scan.nextLine();
       //testing to see if it is receiving the whole input
       System.out.println(input);
    }
