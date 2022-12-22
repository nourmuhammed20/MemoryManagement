import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Process> Processes = new ArrayList<Process>();
        ArrayList<Partition> Partitions = new ArrayList<Partition>();
        Scanner obj = new Scanner(System.in);
        WorstFit wrst = new WorstFit();

        //Pre-Defined
        Processes.add(new Process("Process 1",15));
        Processes.add(new Process("Process 2",90));
        Processes.add(new Process("Process 3",30));
        Processes.add(new Process("Process 4",100));
        Partitions.add(new Partition("Partition 0",90));
        Partitions.add(new Partition("Partition 1",20));
        Partitions.add(new Partition("Partition 2",5));
        Partitions.add(new Partition("Partition 3",30));
        Partitions.add(new Partition("Partition 4",120));
        Partitions.add(new Partition("Partition 5",80));


//        System.out.println("Enter Number of Partitions :");
//        int part = obj.nextInt();
//        for (int i = 1; i <=part ; i++) {
//            System.out.println("Enter Partition Name : ");
//            String name = obj.next();
//            System.out.println("Enter Partition size : ");
//            int size = obj.nextInt();
//            Partitions.add(new Partition(name,size));
//        }
//
//        System.out.println("Enter Number of Processes :");
//        int proc = obj.nextInt();
//        for (int i = 1; i <=proc ; i++) {
//            System.out.println("Enter Partition Name : ");
//            String name = obj.next();
//            System.out.println("Enter Partition size : ");
//            int size = obj.nextInt();
//            Processes.add(new Process(name,size));
//        }

        System.out.println("Select the policy you want to apply :\n" +
                "1. First fit\n" +
                "2. Worst fit\n" +
                "3. Best fit\n");
        int choice = obj.nextInt();
        switch (choice){
            case 1:
            case 2:
                wrst.WorstAllocate(Partitions,Processes);
                break;
            case 3:
            default:
                System.out.println("Invalid input!");
        }

    }
}