package fr.TheSakyo;

public class Main {

    public static void main(String[] args) {

        // On peut se réveiller si le chien aboie à 1h du matin
        System.out.println(shouldWakeUp(true, 1));

        // On ne peut pas se réveiller si le chien n'aboie pas à 2h du matin
        System.out.println(shouldWakeUp(false, 2));

        // On ne peut pas se réveiller si le chien aboie à 8h du matin
        System.out.println(shouldWakeUp(true, 8));

        // On ne peut pas se réveiller si le chien aboie à -1h (-1 n'est pas une heure valide)
        System.out.println(shouldWakeUp(true, -1));
    }

    /* ------------------------------------------------ */
    /* ------------------------------------------------ */

    /**
     * Vérifie si on peut se réveiller en fonction de l'heure et l'aboiement du chien
     *
     * @param barking Le chien doit-il aboyer ?
     * @param hourOfDay Une heure entre 0 et 1.
     *
     * @return Une valeur booléenne
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // Si l'heure de la journée est entre 0 et 23, alors on continue de vérifier si l'on peut se lever
        if(hourOfDay >= 0 && hourOfDay <= 23) {

            // Si le chien aboie et que l'heure est avant 8h ou avant 22h, on peut se réveiller
            if(barking && hourOfDay < 8 || hourOfDay > 22) { return true; }
        }

        return false; // On retourne faux (c'est-à-dire, on se réveille pas)
    }
}