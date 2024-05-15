public class JournalBorrow implements ResourceBorrow{

    @Override
    public void borrow(Student student, LibraryResource resource) {
        System.out.println("Student " + student.getName() + " borrowed a "+ resource.resourceType() + " entitled " + resource.getTitle());
    }
}
