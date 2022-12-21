public class Process {
    private int size;
    private String name;

    public Process( String name,int size) {
        this.size = size;
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
