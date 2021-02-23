
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class helloworld {

  public static void main(String args[]) {

    System.out.println(" Hello World! ");

    // Adding the first message.

    System.out.println("Here ye : important announcement");

    // this is the second message.
    System.out.println(" this is the final Comment");
    // Saying Hi to both Alice and Bob.

    System.out.println("Hi to Alice and Bob!");

    // Alice code.
    System.out.println("Hi Alice");
    // saying hi to Denise.

    System.out.println(" Hi Denise!");

    // Saying Hi to Ester.
    System.out.println("Hi Ester!");

    /* Displaying the Current date to the user. */

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
      System.out.println("Today's date and time: ");
    System.out.println(dtf.format(now));

  }

}
