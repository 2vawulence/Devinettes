import java.util.Random;
import java.util.Scanner;

public class JeuDevinette {
    private int grade;
    private int nombreRandom;
    private int count;

    //  initialise grade à 0 et génère le nombre aléatoire
    public JeuDevinette() {
        grade = 0;
        Random rand = new Random();
        nombreRandom = rand.nextInt(100) + 1;
        count = 0;
    }

    // Méthode pour jouer une partie
    public void jouer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devinez le nombre entre 1 et 100.");

        while (grade != nombreRandom && count < 10) {
            System.out.print("Entrez un nombre: ");
            grade = scanner.nextInt();
            count++;

            if (grade > nombreRandom) {
                System.out.println("Nombre trop grand ");
            } else if (grade < nombreRandom) {
                System.out.println("Nombre trop  petit");
            } else {
                System.out.println("Bravo ! Vous avez trouvé en " + count + " tentatives.");
            }
        }

        if (grade != nombreRandom) {
            System.out.println("Perdu ! Le nombre était : " + nombreRandom);
        }
        scanner.close();
    }

    }


