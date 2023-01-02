

// We have to trasnfer n number of disk from s= source tower to
// d = destination tower and there will be another tower facility
// h = helper tower to facilitated the whole transfer. We cannot move
// more then one disk at a time and no bigger disk can put on top
// of a smaller disk during this whole transfer.
// TIME COMPLEXITY WILL BE 2^n


public class D_TowerOfHanoi {
    public static void main(String[] args){
        int numDisk = 4;
        String srcT = "Source Tower";
        String hlpT = "Help Tower";
        String desT = "Destination Tower";
        towerOfHanio(numDisk, srcT, hlpT, desT);
    }
    public static void towerOfHanio(int numDisk, String srcT, String hlpT, String desT){
        // BASECASES
        // We can trasfer a single disk without any helper that is we can
        // directly trasfter a disk from sourceT to dTower
        if(numDisk==1){
            System.out.println("Transfer disk: " + numDisk + " from " + srcT + " to " + desT);
            return;    
        }
        // the above will be already done for nth disk
        // towerOfHanio(numDisk, srcT, hlpT, desT)
        // so we will start from n-1 disk where the 
        towerOfHanio(numDisk-1, srcT, desT, hlpT);
        // Printing the trasfered disk n
        System.out.println("Transfer disk: "+ numDisk + " from " + srcT + " to " + desT);
        towerOfHanio(numDisk-1, hlpT, srcT, desT);

    }   
}
