public class Main {
    public static void main(String[] args) {


        // ************************************************* CONDIZIONALI ******************************************

       /* int x = 20, y = 30, z = 40;

        if (!(x > y)) System.out.println("X è minore di Y");
        else System.out.println("X è maggiore di Y");

        if (x > y) {
            System.out.println("X è maggiore di Y");
        } else if (x == 200) {
            System.out.println("X è uguale 100");
        } else {
            System.out.println("X è minore di Y ");
        }

        String result = x > y ? "X è maggiore di Y" : "X è minore di Y";
        System.out.println(result);

        int w = x > y ? (x > z ? x : z) : (y > z ? y : z); // Meglio non abusare del ternary operator per questioni di leggibilità
        System.out.println(w);*/

        // ******************************************** SWITCH-CASE **************************************************
/*        String favouriteColor = "green";
        String favouriteDish = "pizza";

        switch (favouriteColor) {
            case "red": {
                System.out.println("Il colore preferito è il rosso!");
                break;
            }
            case "yellow": {
                System.out.println("Il colore preferito è il giallo!");
                break;
            }
            case "blue": {
                System.out.println("Il colore preferito è il blu!");
                break;
            }
            default: {
                System.out.println("Il colore non è nè rosso nè giallo nè blu");
            }

        }*/

/*        if(favouriteDish.equals("pizza")){ <-- Quando si comparano due stringhe meglio usare ".equals" invece che "=="

        }*/

        int x = 10, y = 20;

        int z = (x > y) ? -100 : 100;

        switch (z) {
            case 10: {
                System.out.println("z é 10");
                x++;
                break;
            }
            case -100: {
                System.out.println("z é -100");
                break;
            }
            case 100: {
                System.out.println("z é 100");
                x--;
                break;
            }
            case 1000: {
                System.out.println("z é 1000");
                x--;
                break;
            }
            default: {
                System.out.println("Default");
                x--;
            }
        }

        System.out.println("X è " + x);


    }
}