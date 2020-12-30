package fileallocationsimulator.java;

import java.util.Scanner;
import java.util.Random;

public class Allocations {

    public void linkedAllocation(int size, int blocks[]){

        Scanner sb = new Scanner(System.in);
        Scanner len = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the starting block number : ");
        int startBlock = sb.nextInt();
        System.out.println("Enter the name of the new file : ");
        String fileName = fn.next();
        System.out.println("Enter the length of the file : ");
        int length = len.nextInt();
        Random num = new Random();
        int clen = length;
        int actend = length + startBlock +1;
        int end = clen + startBlock;
        if (blocks[startBlock] == 0){
            blocks[startBlock]=1;
            System.out.println(fileName + " " +startBlock + " ----> " + blocks[startBlock]);
            for (int i = startBlock;i < end-1;i++){
                int randnum = 0 + num.nextInt(size);

                if (blocks[randnum] == 0){
                    blocks[randnum] = 1;
                    System.out.println( fileName + " " + randnum + " ----> " + randnum);
                }
                else {
                    while(blocks[randnum]==1){
                        randnum = 0 + num.nextInt(size);
                        clen++;
                    }


                }
            }
        }
        else

            System.out.println(fileName + " " + "The block with number : " + startBlock + " is already allocated !");
            System.out.println("Want to enter another file ? ");
            System.out.println("1 for yes ");
            System.out.println("0 for no : ");
            int choice = ch.nextInt();
            if (choice == 1){
                linkedAllocation(size,blocks);

            }
            else  {
                System.exit (0);
            }



    }

}
