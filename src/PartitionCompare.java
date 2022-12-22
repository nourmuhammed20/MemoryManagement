import java.util.Comparator;

public class PartitionCompare implements Comparator<Partition> {
    //Check Size
    @Override
    public int compare(Partition o1, Partition o2) {  //override for Process usage
        if (o2.getSize()<=o1.getSize()){
            return 1;
        }else return -1;
    }
}
