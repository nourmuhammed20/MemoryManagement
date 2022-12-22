public class Process {
    private int size;
    private String name;

    boolean Allocated;

    public boolean isAllocated() {
        return Allocated;
    }

    public void setAllocated(boolean allocated) {
        Allocated = allocated;
    }

    public Process(String name, int size) {
        this.size = size;
        this.name = name;
        Allocated=false;
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
