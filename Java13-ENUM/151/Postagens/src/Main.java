import Entities.Comment;
import Entities.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        String title = "Travel to New zealand";
        String content = "I'm  going to visit this wonderful country!";
        int likes = 12;

        Post p1 = new Post(LocalDateTime.now(), title, content, likes);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


    }
}