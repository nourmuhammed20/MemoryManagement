public class Partition {
    private String name;
    private int size;
    boolean Free;

    public Process getProcessName() {
        return ProcessName;
    }

    public void setProcessName(Process processName) {
        ProcessName = processName;
    }

    Process ProcessName;

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
