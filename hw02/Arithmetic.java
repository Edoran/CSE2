//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arithmetic Java Program
//
public class Arithmetic{
    public static void main (String[]args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        double totalsockCost$;   //total cost of socks
        double socktax;   //tax on socks
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        double totalglassCost$;   //total cost of glasses
        double glasstax;   //tax on glasses
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        double totalenvelopeCost$;   //total cost of envelopes
        double envelopetax;   //tax on envelopes
        
        
        //Total Cost of socks
        totalsockCost$=nSocks*sockCost$;
        //cost of socks with tax
        socktax=totalsockCost$*taxPercent;
        
        System.out.println("The total cost of socks is "+totalsockCost$);
        System.out.println("The sales tax for the socks is "+socktax);
       
        
        //Total Cost of glasses
        totalglassCost$=nGlasses*glassCost$;
        //cost of glasses with tax
        glasstax=totalglassCost$*taxPercent;
        
        System.out.println("The total cost of glasses is "+totalglassCost$);
        System.out.println("The sales tax for the glasses is "+glasstax);
        
        
        //Total Cost of envelopes
        totalenvelopeCost$=nEnvelopes*envelopeCost$;
        //cost of envelopes with tax
        envelopetax=totalenvelopeCost$*taxPercent;
        
        System.out.println("The total cost of envelopes is "+totalenvelopeCost$);
        System.out.println("The sales tax for the envelopes is "+envelopetax);
        
        double totalPurchaseCost$;
        double totalSalesTax$;
        double totalpaid$;
        //Total Cost of Purchases
        totalPurchaseCost$=totalsockCost$+totalenvelopeCost$+totalglassCost$;
        //Total actually paid for this transaction, including sales tax.
        totalSalesTax$=totalPurchaseCost$*taxPercent;
        totalpaid$=totalPurchaseCost$+totalSalesTax$;
        System.out.println("The total cost of purchases, before tax, is "+totalPurchaseCost$);
        System.out.println("The total cost of sales tax is "+totalSalesTax$);
        System.out.println("The total cost of purchases is "+totalPurchaseCost$);
        

    }
}