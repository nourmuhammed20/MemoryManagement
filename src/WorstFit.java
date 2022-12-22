import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class WorstFit {
    int counter,rem;
    public void WorstAllocate(ArrayList<Partition>parts , ArrayList<Process> procs){
        counter = parts.size();
        parts.sort(new PartitionCompare());
        for (int i = 0; i < procs.size(); i++) { //15
            for (int j = parts.size()-1; j>0 ; j--) { // 120
                if(procs.get(i).getSize()<=parts.get(j).getSize() && parts.get(j).Free){
                    rem = parts.get(parts.size()-1).getSize()-procs.get(i).getSize(); //105
                    parts.get(j).setSize(procs.get(i).getSize());//15
                    parts.get(j).Free = false;
                    parts.get(j).setProcessName(procs.get(i).getName());
                    // parts.get(parts.size()-(j)).setProcessName(procs.get(i).getName());
                    if(rem>0){
                        String name=String.format("Partition %s",counter);
                        Partition p = new Partition(name,rem);
                        counter++;
                        parts.add(p);
                    }
                    parts.sort(new PartitionCompare());
                    break;
                }
                else{
                    System.out.println(procs.get(i).getName() +" can not be allocated ");
                }
            }
        }
        list(parts);
    }
    public void list(ArrayList<Partition>parts){
        for (int i = 0; i < parts.size(); i++){
            String name = ((parts.get(i).ProcessObj == "null")? "External fragment":parts.get(i).ProcessObj);
            System.out.println(parts.get(i).getName() + " ("+parts.get(i).getSize() +") => "+ name);
        }

    }

}
