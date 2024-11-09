    public class Main {
        public static void main(String[] args) {
            Family family = new Family();

            // Add uncles
            family.addUncle("Albert");
            family.addUncle("Bill");
            family.addUncle("Charlie");
            family.addUncle("David");

            // Add nieces
            family.addNiece("Amy", 12, 7);
            family.addNiece("Beatrice", 15, 3);
            family.addNiece("Claire", 22, 10);
            family.addNiece("Emily", 5, 6);

            Uncle albert = family.findUncle("Albert");
            albert.addPresent(family.findNiece("Amy"), "The Wonder of Computers");
            albert.addPresent(family.findNiece("Beatrice"), "Science Kit");
            albert.addPresent(family.findNiece("Claire"), "Puzzle Set");
            albert.addPresent(family.findNiece("Emily"), "Art Supplies");

            // Uncle Bill
            Uncle bill = family.findUncle("Bill");
            bill.addPresent(family.findNiece("Amy"), "Coloring Book");
            bill.addPresent(family.findNiece("Beatrice"), "Coloring Book");
            bill.addPresent(family.findNiece("Claire"), "Magic Set");
            bill.addPresent(family.findNiece("Emily"), "Plant Growing Kit");

            // Uncle Charlie
            Uncle charlie = family.findUncle("Charlie");
            charlie.addPresent(family.findNiece("Amy"), "Story Book");
            charlie.addPresent(family.findNiece("Beatrice"), "Lego Set");
            charlie.addPresent(family.findNiece("Claire"), "Sketch Pad");
            charlie.addPresent(family.findNiece("Emily"), "Toy Car");

            // Uncle David
            Uncle david = family.findUncle("David");
            david.addPresent(family.findNiece("Amy"), "Board Game");
            david.addPresent(family.findNiece("Beatrice"), "Puzzle Cube");
            david.addPresent(family.findNiece("Claire"), "Stuffed Animal");
            david.addPresent(family.findNiece("Emily"), "Jewelry Box");

            System.out.println("Uncles:");
            family.listUncles();

            System.out.println("\nNieces:");
            family.listNieces();

            // Display the list of presents each uncle has chosen to give
            System.out.println("\nDaftar Hadiah dari Setiap Paman:");
            for (Uncle uncle : family.getUncles()) {
                System.out.println("Paman " + uncle.getName() + ":");
                uncle.listPresents();
                System.out.println();
            }

            // Display the list of presents each niece will receive
            System.out.println("Daftar Hadiah yang Akan Diterima Setiap Keponakan:");
            for (Niece niece : family.getNieces()) {
                System.out.println("Keponakan " + niece.getName() + ":");
                niece.listPresents();
                System.out.println();
            }
        }
    }