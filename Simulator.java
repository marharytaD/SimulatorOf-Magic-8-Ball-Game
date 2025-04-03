import codedraw.CodeDraw;
import codedraw.Palette;

import java.awt.Color;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
public class Simulator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your age");
            String age = scanner.nextLine();
            System.out.println("Enter your question");
            String question = scanner.nextLine();
            int counter = 0;
            for (int i = 0; i < question.length(); i++) {
                counter++;
            }
            String text = " ";
            int randomNumber = random.nextInt(101);
            if (randomNumber < 50) {
                text = "Yes";
            } else if (randomNumber > 50) {
                text = "No";
            } else if (randomNumber == 50) {
                text = "Maybe";
            }
            System.out.println("Answer:" + text);
            drawGame(name, age, question, text, counter);
            scanner.close();
        }

        private static void drawGame(String name, String age, String question, String answer, int counter) {
            CodeDraw cd = new CodeDraw(500, 500);
            cd.setColor(Palette.BISQUE);
            cd.fillSquare(0, 0, 500);

            cd.setColor(Palette.LIGHT_GREEN);
            cd.fillRectangle(20, 100, 80, 40);
            cd.fillRectangle(130, 100, 80, 40);
            cd.fillRectangle(290, 100, 100 + (counter * 10), 40);
            cd.setColor(Palette.MAGENTA);
            cd.fillRectangle(150, 400, 150, 50);

            cd.setColor(Color.BLACK);
            cd.drawText(20, 100, "Name: ");
            cd.drawText(20, 120, name);
            cd.drawText(130, 100, "Age: ");
            cd.drawText(130, 120, age);
            cd.drawText(290, 100, "Question: ");
            cd.drawText(290, 120, question);
            cd.drawText(150, 415, "Answer: " + answer);
            cd.show();
        }
}
