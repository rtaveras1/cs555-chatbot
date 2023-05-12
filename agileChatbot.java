import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Hello, I am the cs555 Chatbot. You can ask me about any terminology regarding Agile Methodologies!");
       String input = scan.nextLine().toLowerCase();
        //testing to see if it is receiving the whole input
       //System.out.println(input);
       
       String [] keywords = {"scrum", "crystal", "lean", "xp", "extreme programming", "rup", "waterfall"};
       
       //got the idea for this for loop from stack overflow because I was stuck : 
       //https://stackoverflow.com/questions/29573709/scanning-the-entire-user-input-for-a-matching-keyword-in-java#:~:text=One%20is%20to%20use%20the%20contains%20method%20on,if%20%28input.contains%20%28keywords%20%5Bi%5D%29%29%20%7B%20System.out.println%20%28%22Found%20keyword%21%22%29%3B
       for (String keyword : keywords) {
            if (input.contains(keyword)) {
                //this is to make sure it is identifying the correct keyword is found
                //System.out.println("Found keyword match, " + keyword);
                
                //goes into specific definitions for each keyword it knows, if identified
                if (keyword.equals("scrum")){
                    System.out.println("Sure, I can tell you about Scrum! Scrum is an agile method framework used by teams to develop projects. In Scrum, work is divided into small, manageable chunks called sprints, which are typically two to four weeks long. Each sprint begins with a planning meeting where the team selects a set of items from the product backlog to work on. Throughout the sprint, the team meets daily in a short stand-up meeting to discuss progress and identify any roadblocks. At the end of each sprint, the team holds a sprint review meeting to demonstrate the work completed and receive feedback, and a sprint retrospective meeting to review the process and identify areas for improvement.");
                }
                else if (keyword.equals("crystal")){
                    System.out.println("Certainly! Crystal is an agile methodology for software development is designed to be adaptable to the needs of the project team, and it is often used on small to medium-sized projects based on the size of the team. There are several variations of the Crystal methodology, ranging from Crystal Clear for the smallest projects, to Crystal Orange and Crystal Red for larger, more complex projects. The different variations of the methodology share the same core values and principles, but provide different guidance on how to implement them.");
                }
                else if (keyword.equals("lean")){
                    System.out.println("Lean software development is a set of principles and practices that aim to reduce waste and focus on delivering value to the customer. It is based on the lean manufacturing principles developed by Toyota, which emphasizes the elimination of waste and the continuous improvement of processes. The 7 principles of lean are:");
                    System.out.println("1. Eliminate Waste");
                    System.out.println("2. Amplify Learning");
                    System.out.println("3. Decide as late as possible");
                    System.out.println("4. Deliver as fast as possible");
                    System.out.println("5. Empower the team");
                    System.out.println("6. Build integrity in");
                    System.out.println("7. See the whole");
                }
                else if (keyword.equals("xp") || keyword.equals("extreme programming")){
                    System.out.println("Extreme Programming (XP) is an agile methodology that focuses on improving responsiveness to changing customer requirements. It is a team-based approach that emphasizes frequent releases of working software, customer involvement, and continuous feedback and testing. XP incorporates a number of practices including pair programming, continuous integration, and automated testing.");  
                }
                else if (keyword.equals("rup")){
                    System.out.println("Of course! (RUP) The Rational Unified Process is an iterative framework that was created by Rational Software Corporation, now part of IBM. It is based on 6 best practices of software engineering which are:");
                    System.out.println("1. Develop iteratively");
                    System.out.println("2. Manage Requirements");
                    System.out.println("3. Use component-based architectures");
                    System.out.println("4. Model software visually");
                    System.out.println("5. Continuously verify software quality");
                    System.out.println("6. Control changes");
                }
                else if (keyword.equals("waterfall")){
                    System.out.println("The waterfall method is a traditional approach to software development. It follows a sequential process where progress flows in one direction through a series of phases: requirements gathering and analysis, design, implementation, testing, deployment, and maintenance. Each phase must be completed before moving onto the next phase. This approach assumes that the requirements of a project can be fully understood and defined upfront, and that changes can be easily accommodated.");   
                } 
            }
           //if a keyword is not found in the input, it lets the user know that it does not understand, and asks for only the keyword in order to store it and add it later.
           else {
               System.out.println("My apologies, I do not seem to have any knowledge on what you are asking. May you give me one keyword of the terminology you are looking for so that my creator can add its definition in the future?");
               ArrayList<String> unknown = new ArrayList<String>();
               Scanner scan2 = new Scanner(System.in);
               String newWord = scan2.next().toLowerCase();
               System.out.println("Thank you! My developers will take " + newWord + " into account when they update me. :) ");
               unknown.add(newWord);
              
               //this is just to see if it really adds the word to the list
               System.out.println(unknown);
           }
    
    }
}
}
