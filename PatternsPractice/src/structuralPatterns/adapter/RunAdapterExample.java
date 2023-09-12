package structuralPatterns.adapter;

import java.time.YearMonth;

public class RunAdapterExample {
    public static void main(String[] args) {

        MasterCard masterCard = new MasterCard(
                "234324",
                "Bob",
                YearMonth.of(2025,9),
                "0303",
                10_000
        );


        IVisa adapter = new VisaAdapter(masterCard);

        getInfo(adapter);

    }

    public static void getInfo(IVisa visa){
        System.out.println(visa.getCardNumber());
        System.out.println(visa.getOwnerName());
        System.out.println(visa.getCardExpDate());
        System.out.println(visa.getCvvNumbers());
        System.out.println(visa.getTotalAmount());
    }
}
