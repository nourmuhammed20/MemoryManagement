import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class WorstFit {
    int counter,rem;
    public void WorstAllocate(ArrayList<Partition>parts , ArrayList<Process> procs){
        counter = parts.size();
        parts.sort(new PartitionCompare());
        for (int i = 0; i < procs.size(); i++) {
            if(procs.get(i).getSize()<=parts.get(parts.size()-1).getSize()){
                rem = parts.get(parts.size()-1).getSize()-procs.get(i).getSize();
                parts.get(parts.size()-1).setSize(rem);
                parts.get(parts.size()-1).setName();
            }
        }
    }

}
