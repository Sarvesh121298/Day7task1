//import javax.sound.sampled.SourceDataLine;

// create class Mainbank parent
//             name
//             id
//             phno
//             private bankTotalfound
//             private bankIntrest
//             checkloan(loan)
//             {
//                 loan<bankTotalfound
//             }
//             totalintreat(branchIntrest){
//                 return bankIntrest+branchIntrest
//             }
//         creat banckbranch child
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

public class bank{
    String name;
    int id;
    long phno;
    private long bankTotalfund;
    private float bankInterest;
    public bank(long bankTotalfund, float bankInterest) {
        this.bankTotalfund = bankTotalfund;
        this.bankInterest = bankInterest;
    }

/**
 *
 */
public boolean checkloan(long loan){
    boolean flag = false;
    if(loan<bankTotalfund){
        System.out.println("Loan id approved!!");
        flag = true;
    }
        return flag;
}
    public void totalInterest(float branchInterest){
        System.out.println(bankInterest + branchInterest);
    
    

    }

}
    
