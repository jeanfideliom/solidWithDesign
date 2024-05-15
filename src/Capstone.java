public class Capstone implements LibraryResource{
    private String title;
    public Capstone(String title){
        this.title = title;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Capstone";
    }
}
