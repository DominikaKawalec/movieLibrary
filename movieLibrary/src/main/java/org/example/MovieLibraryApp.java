package org.example;

import org.example.handlers.MenuHandlers;
import org.example.handlers.UserInputHandler;
import org.example.models.MovieLibrary;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();
        MenuHandlers.print();
        while (true) {
            switch (UserInputHandler.getMenuOptions()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYALLMOVIESFORACTOR:
                    movieLibrary.getFilmsForActor();
                    break;
                case QUIT:
                    System.out.println("Wychodzenie");
                    System.exit(1);
            }

        }
    }
}