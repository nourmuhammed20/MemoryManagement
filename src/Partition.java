public class Partition {
    private String name;
    private int size;
    boolean Free;

    public Partition(String name, int size) {
        this.name = name;
        this.size = size;
        Free=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }





}
