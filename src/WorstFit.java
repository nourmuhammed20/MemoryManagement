import java.util.ArrayList;

public class WorstFit {
    int counter,rem;
    public ArrayList<Partition> WorstAllocate(ArrayList<Partition>parts , ArrayList<Process> procs){
        counter = parts.size();
        parts.sort(new PartitionCompare());
        for (int i = 0; i < procs.size(); i++) { //15
            for (int j = parts.size()-1; j>=0 ; j--) { // 120
                if(procs.get(i).getSize()<=parts.get(j).getSize() && parts.get(j).Free){
                    rem = parts.get(j).getSize()-procs.get(i).getSize(); //105
                    parts.get(j).setSize(procs.get(i).getSize());//15
                    parts.get(j).Free = false;
                    parts.get(j).setProcessName(procs.get(i).getName());
                    procs.get(i).setAllocated(true);
                    if(rem>0){
                        String name=String.format("Partition %s",counter);
                        Partition p = new Partition(name,rem);
                        counter++;
                        parts.add(p);
                    }
                    parts.sort(new PartitionCompare());
                    break;
                }
            }
        }
        list(parts,procs);
        return parts;
    }
    public void list(ArrayList<Partition>parts,ArrayList<Process>processes){

        for (int i = 0; i < parts.size(); i++){
            String name = ((parts.get(i).ProcessObj == "null")? "External fragment":parts.get(i).ProcessObj);
            System.out.println(parts.get(i).getName() + " ("+parts.get(i).getSize() +" KB) => "+ name);
        }
        for (int i = 0; i <processes.size() ; i++) {
            if(!processes.get(i).isAllocated())
            {
                System.out.println(processes.get(i).getName()+" is Not Allocated ");
            }
        }
    }
}
