package homework1_2.homework1_2_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Movie[] movies = new Movie[10];
        int maxsimum = 0;

        for (int i = 0; i < movies.length; i++) {
            Movie movie = new Movie(String.valueOf(i), random.nextInt(10));
            movies[i] = movie;
        }


        for (int i = 0; i < movies.length; i++) {
            if (maxsimum > movies[i].getRating()) {
                maxsimum = movies[i].getRating();
            }
        }

        for (int i = 0; i < movies.length; i++) {
            if (maxsimum == movies[i].getRating()) {
                System.out.println("best movies is: " + movies[i].getTitle());
            }
        }
    }
}
