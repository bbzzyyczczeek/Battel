import java.util.Random;

public class Dice {
   static Random random = new Random();

   static String dive[] = {"""
             - - - - -
            |         |
            |    0    |
            |         |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |         |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |    0    |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |         |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |    0    |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0  0  0 |
            |         |
            | 0  0  0 |
             - - - - -
            """,
    };
    public static String rool(){
        int sides = random.nextInt(dive.length);

        return dive[sides];

    }
}

