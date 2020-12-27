/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileallocationsimulator;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class FileAllocationSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file1 = new File(2,"diary.txt");
        File file2 = new File(4,"die.txt");
        File file3 = new File(6,"test.txt");
        Memory HDD = new Memory(16);
        
        HDD.contigousAllocation(file1, 0);
        HDD.contigousAllocation(file2, 8);
        HDD.contigousAllocation(file3,12);
        
        HDD.printFilesInMemory();
        


    }
    
}
