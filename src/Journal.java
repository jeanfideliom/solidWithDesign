public class Journal implements LibraryResource{
    private String title;

    public Journal(String title){
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String resourceType() {
        return "Journal";
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
