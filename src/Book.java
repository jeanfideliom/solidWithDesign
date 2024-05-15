public class Book implements LibraryResource{
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
