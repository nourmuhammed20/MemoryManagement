public class Partition {
    private String name;
    private int size;
    boolean Free;
    String ProcessObj;

    public void setProcessName(String processName) {
        ProcessObj=processName;
    }

    public Partition(String name, int size) {
        this.name = name;
        this.size = size;
        Free=true;
        ProcessObj = "null";
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
