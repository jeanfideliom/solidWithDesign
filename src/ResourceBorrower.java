public class ResourceBorrower implements ResourceBorrow{

    @Override
    public void borrow(Student student, LibraryResource resource) {
        System.out.println("Student " + student.getName() + " borrowed a "+ resource.getResourceType() + " entitled " + resource.getTitle());
    }
}
