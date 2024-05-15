public class TestProgram {
    public static void main(String[] args) {
        Student student001 = new Student("Jean");
        Student student002 = new Student("Fidelio");

        Journal journal001 = new Journal("My Work Journal");
        Journal journal002 = new Journal("My Food Journal");

        Book book001 = new Book("The Alchemist");

        ResourceBorrow borrowVar = new JournalBorrow();
        borrowVar.borrow(student001,journal001);

        borrowVar = new BookBorrow();
        borrowVar.borrow(student002,book001);
    }
}