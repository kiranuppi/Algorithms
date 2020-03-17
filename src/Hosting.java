public class Hosting {

    private  long websites;
    private int Id;
    private String name;

    public Hosting(int Id, String name, long websites) {
    }

    public long getWebsites() {
        return websites;
    }


    public int getId() {
        return Id;
    }

    public String name() {
        return name;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}