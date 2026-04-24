package com.WhatsApp.demo.service;

import com.WhatsApp.demo.Dto.MessageRequest;
import com.WhatsApp.demo.Dto.MessageResponce;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ChatBotService {

    public MessageResponce sendMessage(MessageRequest messageRequest) {
        String message = messageRequest.getMessage().trim().toLowerCase();
        System.out.println("Message From "+messageRequest.getSender()+" : "+  message);

        // Most data only switch are genrate by ai . aside leaving this all code are not genrate by ai
        switch (message.toLowerCase()) {

            case "hi":
                return new MessageResponce("Hello");

            case "hello":
                return new MessageResponce("Hi there!");

            case "hey":
                return new MessageResponce("Hey!");

            case "bye":
                return new MessageResponce("Good bye");

            case "good morning":
                return new MessageResponce("Good Morning!");

            case "good afternoon":
                return new MessageResponce("Good Afternoon!");

            case "good evening":
                return new MessageResponce("Good Evening!");

            case "good night":
                return new MessageResponce("Good Night!");

            case "how are you":
                return new MessageResponce("I am fine, thank you!");

            case "what is your name":
                return new MessageResponce("My name is Chat Bot");

            case "who are you":
                return new MessageResponce("I am your Java chatbot assistant");

            case "date":
                return new MessageResponce(java.time.LocalDate.now().toString());

            case "today date":
                return new MessageResponce(java.time.LocalDate.now().toString());

            case "time":
                return new MessageResponce(java.time.LocalTime.now().withNano(0).toString());

            case "current time":
                return new MessageResponce(java.time.LocalTime.now().withNano(0).toString());

            case "day":
                return new MessageResponce(java.time.LocalDate.now().getDayOfWeek().toString());

            case "today":
                return new MessageResponce("Today is " + java.time.LocalDate.now().getDayOfWeek());

            case "month":
                return new MessageResponce(java.time.LocalDate.now().getMonth().toString());

            case "year":
                return new MessageResponce(String.valueOf(java.time.LocalDate.now().getYear()));

            case "thank you":
                return new MessageResponce("You're welcome!");

            case "thanks":
                return new MessageResponce("Most welcome!");

            case "ok":
                return new MessageResponce("Okay!");

            case "fine":
                return new MessageResponce("Glad to hear that!");

            case "i am sad":
                return new MessageResponce("Don't worry, everything will be fine");

            case "i am happy":
                return new MessageResponce("That's great!");

            case "tell me a joke":
                return new MessageResponce("Why do Java developers wear glasses? Because they don't C#");

            case "motivate me":
                return new MessageResponce("Success starts with self-belief");

            case "study tip":
                return new MessageResponce("Practice daily and stay consistent");

            case "java":
                return new MessageResponce("Java is a powerful object-oriented programming language");

            case "spring boot":
                return new MessageResponce("Spring Boot makes Java development faster and easier");

            case "mysql":
                return new MessageResponce("MySQL is a relational database management system");

            case "backend":
                return new MessageResponce("Backend handles server, database, and business logic");

            case "frontend":
                return new MessageResponce("Frontend is what users see and interact with");

            case "api":
                return new MessageResponce("API helps different software systems communicate");

            case "json":
                return new MessageResponce("JSON is used for data exchange");

            case "html":
                return new MessageResponce("HTML is used to structure web pages");

            case "css":
                return new MessageResponce("CSS is used to style web pages");

            case "javascript":
                return new MessageResponce("JavaScript makes web pages interactive");

            case "python":
                return new MessageResponce("Python is easy and powerful programming language");

            case "c":
                return new MessageResponce("C is a foundational programming language");

            case "c++":
                return new MessageResponce("C++ supports object-oriented programming");

            case "dbms":
                return new MessageResponce("DBMS stands for Database Management System");

            case "sql":
                return new MessageResponce("SQL is used to manage databases");

            case "hibernate":
                return new MessageResponce("Hibernate is an ORM framework in Java");

            case "redis":
                return new MessageResponce("Redis is an in-memory data store");

            case "docker":
                return new MessageResponce("Docker helps in containerizing applications");

            case "kubernetes":
                return new MessageResponce("Kubernetes manages container deployment");

            case "github":
                return new MessageResponce("GitHub is used for code hosting and version control");

            case "git":
                return new MessageResponce("Git is a version control system");

            case "linux":
                return new MessageResponce("Linux is a powerful operating system");

            case "windows":
                return new MessageResponce("Windows is a popular operating system");

            case "interview":
                return new MessageResponce("Prepare basics well and stay confident");

            case "resume":
                return new MessageResponce("Keep your resume simple and professional");

            case "linkedin":
                return new MessageResponce("LinkedIn helps in professional networking");

            case "internship":
                return new MessageResponce("Internships help gain real industry experience");

            case "job":
                return new MessageResponce("Keep learning and applying consistently");

            case "salary":
                return new MessageResponce("Skills decide your salary growth");

            case "college":
                return new MessageResponce("College is the best place to build your future");

            case "exam":
                return new MessageResponce("Stay calm and revise properly");

            case "project":
                return new MessageResponce("Projects help showcase your practical skills");

            case "teamwork":
                return new MessageResponce("Teamwork improves productivity");

            case "leader":
                return new MessageResponce("A good leader inspires others");

            case "friend":
                return new MessageResponce("A true friend supports you always");

            case "family":
                return new MessageResponce("Family is the biggest support system");

            case "love":
                return new MessageResponce("Love brings happiness and peace");

            case "success":
                return new MessageResponce("Success needs patience and hard work");

            case "failure":
                return new MessageResponce("Failure teaches valuable lessons");

            case "money":
                return new MessageResponce("Money is important but not everything");

            case "health":
                return new MessageResponce("Health is wealth");

            case "food":
                return new MessageResponce("Healthy food keeps you strong");

            case "water":
                return new MessageResponce("Drink enough water daily");

            case "exercise":
                return new MessageResponce("Exercise keeps body and mind healthy");

            case "sleep":
                return new MessageResponce("Good sleep improves productivity");

            case "travel":
                return new MessageResponce("Travel gives new experiences");

            case "book":
                return new MessageResponce("Books are a source of knowledge");

            case "movie":
                return new MessageResponce("Movies can entertain and inspire");

            case "music":
                return new MessageResponce("Music refreshes the mind");

            case "cricket":
                return new MessageResponce("Cricket is a very popular sport");

            case "football":
                return new MessageResponce("Football is loved worldwide");

            case "india":
                return new MessageResponce("India is a beautiful country");

            case "lucknow":
                return new MessageResponce("Lucknow is famous for its culture and food");

            case "teacher":
                return new MessageResponce("Teachers guide us toward success");

            case "student":
                return new MessageResponce("Students should focus on learning");

            case "goal":
                return new MessageResponce("A clear goal gives direction");

            case "dream":
                return new MessageResponce("Dream big and work hard");

            case "hard work":
                return new MessageResponce("Hard work always pays off");

            case "discipline":
                return new MessageResponce("Discipline is the key to success");

            case "focus":
                return new MessageResponce("Focus helps achieve goals faster");

            case "confidence":
                return new MessageResponce("Confidence creates opportunities");

            case "english":
                return new MessageResponce("Practice daily to improve English");

            case "communication":
                return new MessageResponce("Good communication builds strong connections");

            case "presentation":
                return new MessageResponce("Confidence makes presentations better");

            case "bank":
                return new MessageResponce("Banks help manage money safely");

            case "upi":
                return new MessageResponce("UPI makes digital payments easy");

            case "internet":
                return new MessageResponce("Internet connects the whole world");

            case "wifi":
                return new MessageResponce("WiFi provides wireless internet access");

            case "ip address":
                return new MessageResponce("IP address identifies devices on a network");

            case "https":
                return new MessageResponce("HTTPS secures website communication");

            case "password":
                return new MessageResponce("Use strong passwords for safety");

            case "security":
                return new MessageResponce("Security protects your data");

            case "mobile":
                return new MessageResponce("Mobile phones make life easier");

            case "laptop":
                return new MessageResponce("Laptops are useful for coding and study");

            case "computer":
                return new MessageResponce("Computers are essential in modern life");

            case "artificial intelligence":
                return new MessageResponce("AI helps machines think smartly");

            case "chatgpt":
                return new MessageResponce("ChatGPT is an AI assistant");

            default:
                return new MessageResponce("Sorry I can not understand");
        }

    }

}
