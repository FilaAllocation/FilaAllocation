/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileallocationsimulator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Seif
 */
public class FileAllocationSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.println("Enter the number of operation : ");
        System.out.println("1- Allocate a file in memory ");
            System.out.println("2- exit");
        int operation = op.nextInt();
        
        while (operation != 2){ 
            switch (operation) {
            case 1:
                 
        
            
            
           
        Scanner ms = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);
        Scanner fl = new Scanner(System.in);
        Scanner nof = new Scanner(System.in);
        Scanner sof = new Scanner(System.in);
        System.out.print("Enter number of memry blocks : ");
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
