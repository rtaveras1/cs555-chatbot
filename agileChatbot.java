import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Hello, I am the cs555 Chatbot. You can ask me about any terminology regarding Agile Methodologies!");
       String input = scan.nextLine();
        //testing to see if it is receiving the whole input
       //System.out.println(input);
       
       String [] keywords = {"scrum", "crystal", "lean", "xp", "rup", "waterfall model"};
       
       //got the idea for this for loop from stack overflow because I was stuck : 
       //https://stackoverflow.com/questions/29573709/scanning-the-entire-user-input-for-a-matching-keyword-in-java#:~:text=One%20is%20to%20use%20the%20contains%20method%20on,if%20%28input.contains%20%28keywords%20%5Bi%5D%29%29%20%7B%20System.out.println%20%28%22Found%20keyword%21%22%29%3B
       for (String keyword : keywords) {
            if (input.contains(keyword)) {
                System.out.println("Found keyword match, " + keyword);
            }
    
    }
}
}
