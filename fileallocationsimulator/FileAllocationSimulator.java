public class FileAllocationSimulator {

    public static int size;
    public static int blocks[];

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Enter the number of operation : ");
        System.out.println("1- Allocate a file in memory with Contigious memory allocation");
        System.out.println("2- Allocate a file in memory with linkedlist allocation");
	System.out.println("3- Allocate a file in memory with indexed allocation");
        System.out.println("4- exit");
        int operation = op.nextInt();

        while (operation != 4){
            switch (operation) {
                case 1:





                    Scanner ms = new Scanner(System.in);
                    Scanner fn = new Scanner(System.in);
                    Scanner fl = new Scanner(System.in);
                    Scanner nof = new Scanner(System.in);
                    Scanner sof = new Scanner(System.in);
                    System.out.print("Enter number of memory blocks : ");
                    int memorySize = ms.nextInt();
                    Memory HDD = new Memory(memorySize);
                    System.out.print("Enter the number of files you want in memory : ");
                    int numOfFiles = nof.nextInt();

                    File files[];
                    files = new File[numOfFiles];
                    for (int i =0;i<numOfFiles;i++){
                        System.out.print("Enter the name of the file : ");
                        String fileName = fn.next();
                        System.out.print("Enter the length of the file : ");
                        int fileLength = ms.nextInt();
                        System.out.print("Enter the starting of the file : ");
                        int startOfFile = sof.nextInt();
                        files[i] = new File(fileLength,fileName);
                        HDD.contigousAllocation(files[i], startOfFile);

                    }

//        File file10 = new File(15,"diary.txt");
//        File file11 = new File(8,"die.txt");
//        File file12 = new File(5, "test12.txt");
//
//
//        HDD.contigousAllocation(file10,100);
//        HDD.contigousAllocation(file11,123);
//        HDD.contigousAllocation(file12,133);


                    HDD.printFilesInMemory();

                case 2:
                    Scanner sz = new Scanner(System.in);
                    System.out.println("Enter the size of memory : ");
                    size = sz.nextInt();

                    blocks = new int[size];
                    for (int i = 0; i < size; i++){
                        blocks[i] = 0;
                    }
                    Allocations linked = new Allocations();

                    linked.linkedAllocation(size, blocks);



                case 3:
 
                    Allocations menu = new Allocations();



                    for (int i = 0; i < menu.size; i++) {
                        menu.blocks[i] = 0;
                        menu.indexed();
                    }
                    menu.indexed();


case 4:

                    System.exit(0);
                default:
                    System.out.println("Sorry this is not an option");
                    System.exit(0);

            }


        /*
        File file1 = new File(2,"diary.txt");
        File file2 = new File(4,"die.txt");
        File file3 = new File(6,"test.txt");
*/



        /*
        HDD.contigousAllocation(file2, 8);
        HDD.contigousAllocation(file3,12);
        */




        }


    }
}
