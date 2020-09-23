package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex10_PokeMon_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerInitial = Integer.parseInt(scanner.nextLine());
        int pokePowerRemainding = pokePowerInitial;
        int pokeDistance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedTargets = 0;

        while (pokePowerRemainding >= pokeDistance) {
            pokePowerRemainding -= pokeDistance;
            pokedTargets++;
            if (pokePowerInitial % 2 == 0 && pokePowerRemainding == (pokePowerInitial / 2)) {
                pokePowerRemainding /= exhaustionFactor;
            }
        }
        System.out.println(pokePowerRemainding);
        System.out.println(pokedTargets);
    }
}
