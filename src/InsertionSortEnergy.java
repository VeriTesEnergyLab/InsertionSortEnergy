/**
 *
 * @author danilo_alvees
 */

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class InsertionSortEnergy {
    public static void insertionSortVector(Vector<Integer> numbers) {
        //double consumption3 = 0;
        double consumption4 = 0;
        double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        //int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;

        //2
        int i, j;
        int key;
        int n = numbers.size();
        //2
        //double[] before3 = EnergyCheckUtils.getEnergyStats();       
        //3
        for (j = 1; j < n; j++){
            //x3++;
            double[] before4 = EnergyCheckUtils.getEnergyStats();
            //4
            x4++;
            key = numbers.get(j);
            //4
            double[] after4 = EnergyCheckUtils.getEnergyStats(); 
            consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //5
            double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (i = j - 1; (i >= 0) && (numbers.get(i) > key); i--){
                x5++;
                double[] before6 = EnergyCheckUtils.getEnergyStats();                 
                //6
                x6++;
                numbers.set((i+1), numbers.get(i));
                //6
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
            }
            double[] after5 = EnergyCheckUtils.getEnergyStats();
            consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5
            
            
            double[] before7 = EnergyCheckUtils.getEnergyStats(); 
            //7
            x7++;
            numbers.set((i+1), key);
            //7
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
        }
        //3    
        //double[] after3 = EnergyCheckUtils.getEnergyStats(); 
        
        //consumption3 = (((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0)/x3;
        consumption4 = consumption4 / x4;
        consumption5 = (consumption5-consumption6) / x5;
        consumption6 = consumption6 / x6;
        consumption7 = consumption7 / x7;
        
//        System.out.print("\nPower consumption 3: " + consumption3 + " N: " + x3);
        System.out.print("\t" + consumption4);
        System.out.print("\t" + consumption5);
        System.out.print("\t" + consumption6);
        System.out.print("\t" + consumption7);
    }

    public static void insertionSortArrayList(ArrayList<Integer> numbers) {
        //double consumption3 = 0;
        double consumption4 = 0;
        double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        //int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;

        //2
        int i, j;
        int key;
        int n = numbers.size();
        //2
        //double[] before3 = EnergyCheckUtils.getEnergyStats();       
        //3
        for (j = 1; j < n; j++){
            //x3++;
            double[] before4 = EnergyCheckUtils.getEnergyStats();
            //4
            x4++;
            key = numbers.get(j);
            //4
            double[] after4 = EnergyCheckUtils.getEnergyStats(); 
            consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //5
            double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (i = j - 1; (i >= 0) && (numbers.get(i) > key); i--){
                x5++;
                double[] before6 = EnergyCheckUtils.getEnergyStats();                 
                //6
                x6++;
                numbers.set((i+1), numbers.get(i));
                //6
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
            }
            double[] after5 = EnergyCheckUtils.getEnergyStats();
            consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5
            
            
            double[] before7 = EnergyCheckUtils.getEnergyStats(); 
            //7
            x7++;
            numbers.set((i+1), key);
            //7
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
        }
        //3    
        //double[] after3 = EnergyCheckUtils.getEnergyStats(); 
        
        //consumption3 = (((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0)/x3;
        consumption4 = consumption4 / x4;
        consumption5 = (consumption5-consumption6) / x5;
        consumption6 = consumption6 / x6;
        consumption7 = consumption7 / x7;
        
//        System.out.print("\nPower consumption 3: " + consumption3 + " N: " + x3);
        System.out.print("\t" + consumption4);
        System.out.print("\t" + consumption5);
        System.out.print("\t" + consumption6);
        System.out.print("\t" + consumption7);
    }

    public static void insertionSortLinkedList(LinkedList<Integer> numbers) {
        //double consumption3 = 0;
        double consumption4 = 0;
        double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        //int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;

        //2
        int i, j;
        int key;
        int n = numbers.size();
        //2
        //double[] before3 = EnergyCheckUtils.getEnergyStats();       
        //3
        for (j = 1; j < n; j++){
            //x3++;
            double[] before4 = EnergyCheckUtils.getEnergyStats();
            //4
            x4++;
            key = numbers.get(j);
            //4
            double[] after4 = EnergyCheckUtils.getEnergyStats(); 
            consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //5
            double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (i = j - 1; (i >= 0) && (numbers.get(i) > key); i--){
                x5++;
                double[] before6 = EnergyCheckUtils.getEnergyStats();                 
                //6
                x6++;
                numbers.set((i+1), numbers.get(i));
                //6
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
            }
            double[] after5 = EnergyCheckUtils.getEnergyStats();
            consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5
            
            
            double[] before7 = EnergyCheckUtils.getEnergyStats(); 
            //7
            x7++;
            numbers.set((i+1), key);
            //7
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
        }
        //3    
        //double[] after3 = EnergyCheckUtils.getEnergyStats(); 
        
        //consumption3 = (((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0)/x3;
        consumption4 = consumption4 / x4;
        consumption5 = (consumption5-consumption6) / x5;
        consumption6 = consumption6 / x6;
        consumption7 = consumption7 / x7;
        
//        System.out.print("\nPower consumption 3: " + consumption3 + " N: " + x3);
        System.out.print("\t" + consumption4);
        System.out.print("\t" + consumption5);
        System.out.print("\t" + consumption6);
        System.out.print("\t" + consumption7);
    }

    public static void main(String[] args) {
        EnergyCheckUtils.init();
        double[] beforeTotalEnergy = EnergyCheckUtils.getEnergyStats();  
        
        //0
        //double[] before0 = EnergyCheckUtils.getEnergyStats();  
        int n = Integer.parseInt(args[0]);
        int opt = Integer.parseInt(args[1]);
        //double[] after0 = EnergyCheckUtils.getEnergyStats();
       // double consumption0 = ((after0[0] - before0[0]) + (after0[1] - before0[1]) + (after0[2] - before0[2])) / 10.0;
        //System.out.print("\nPower consumption 0: " + consumption0);
        //0
        
        if (opt == 1) {
            Vector<Integer> numbers = new Vector<Integer>();
            //1
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.print("\n" + consumption1);        
            //1
            //2
            insertionSortVector(numbers);
            //2            
        }
        else if (opt == 2) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            //8
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.print("\n" + consumption1);        
            //8             
            //9
            insertionSortArrayList(numbers);
            //9            
        }
        else if (opt == 3) {
            LinkedList<Integer> numbers = new LinkedList<Integer>();
            //15
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.print("\n" + consumption1);        
            //15
            //16
            insertionSortLinkedList(numbers);
            //16            
        }
        

        
        
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//        }
        
//        System.out.print();

        
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//        }

 
        //END
        
        double[] afterTotalEnergy = EnergyCheckUtils.getEnergyStats();
        double consumptionTotalEnergy = ((afterTotalEnergy[0] - beforeTotalEnergy[0]) + (afterTotalEnergy[1] - beforeTotalEnergy[1]) + (afterTotalEnergy[2] - beforeTotalEnergy[2])) / 10.0;
        System.out.print("\t" + consumptionTotalEnergy);              
    }

}