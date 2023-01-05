import java.util.Scanner;

//creat banckbranch child
//             name
//             id
//             phno
//             private branchTotalfound
//             private branchIntrest

//             method loan
//             {
//                 checkloan(100000)
//                 loan is approved;
//                 totalintreat(branchIntrest);
//                 totalintreat}

public class branch extends bank {
    private static int bankTotalfund;
    String name;
    int id;
    long phno;
    private static long branchTotalfund;
    private static float branchInterest;
    public branch(long bankTotalfund, float bankInterest, long phno, float branchIntrest) {
        super(bankTotalfund, bankInterest);
        this.name = name;
        this.id = id;
        this.phno = phno;
        this.branchTotalfund = branchTotalfund;
        this.branchInterest = branchIntrest;
    }

    public void loan(long loan){
        super.checkloan(loan);
    }

    public static void main(String[] args) {
        System.out.println("Enter loan amount: ");
        Scanner sc = new Scanner(System.in);
        long loan = sc.nextLong();
        branch b1 = new branch (bankTotalfund= 200000,(float) 1.5, branchTotalfund= 150000, branchInterest= 2 );
        Boolean res = b1.checkloan(loan=100000);
        if(res==true){
            b1.totalInterest(branchInterest);
        }
    
    }

    public void totalInterest(float branchInterest2) {
    }




    
}
