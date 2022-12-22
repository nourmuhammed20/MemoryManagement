import java.util.ArrayList;

public class FirstFit {
    int counter,rem;
    public ArrayList<Partition> FirstAllocate(ArrayList<Partition> parts , ArrayList<Process> procs){
        counter = parts.size();
        for (int i = 0; i < procs.size(); i++) {
            for (int j =0; j<parts.size() ; j++) {
                if(procs.get(i).getSize()<=parts.get(j).getSize() && parts.get(j).Free){
                    rem = parts.get(j).getSize()-procs.get(i).getSize();
                    parts.get(j).setSize(procs.get(i).getSize());
                    parts.get(j).Free = false;
                    parts.get(j).setProcessName(procs.get(i).getName());
                    procs.get(i).setAllocated(true);
                    if(rem>0){
                        String name=String.format("Partition %s",counter);
                        Partition p = new Partition(name,rem);
                        counter++;
                        parts.add(p);
                    }
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
