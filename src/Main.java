public class Main {

    public static void main(String[] args) {
	// Buch- und Kapitelklasse testen
        Chapter c1 = new Chapter("Ein Junge ...", 20, "Lorem ipsum");
        Chapter c2 = new Chapter("Ein Fenster ...", 30, "Lorem ipsum ...");
        Chapter c3 = new Chapter("Die Wurst ...", 40, "Alles hat ein Ende ...");

        Chapter[] allChpts = {c1, c2, c3};
        Book b = new Book("Harry Potter", "JK Rowling", allChpts);
        b.printTOC();

    }
}
