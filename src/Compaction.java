import java.util.ArrayList;

public class Compaction {
    void compact(ArrayList<Partition> parts)
    {
        int size = parts.size();
        int rem=0;
        for (int i = 0; i <parts.size() ; i++) {
            if(parts.get(i).Free)
            {
                rem=rem+parts.get(i).getSize();
                parts.remove(i);
                i--;
            }
        }
        if(rem>0){
            String name=String.format("Partition %s",size);
            Partition p = new Partition(name,rem);
            parts.add(p);
        }
        list(parts);
    }
    public void list(ArrayList<Partition>parts2){

        for (int i = 0; i < parts2.size(); i++){
            String name = ((parts2.get(i).ProcessObj == "null")? "External fragment":parts2.get(i).ProcessObj);
            System.out.println(parts2.get(i).getName() + " ("+parts2.get(i).getSize() +") => "+ name);
        }
    }
}
