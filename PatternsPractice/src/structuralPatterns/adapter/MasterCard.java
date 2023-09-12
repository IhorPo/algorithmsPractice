package structuralPatterns.adapter;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Date;

public class MasterCard implements IMasterCard{
    private String cardNumber;
    private String ownerName;
    private YearMonth cardExpDate;
    private String cvvNumbers;
    private Integer totalAmount;

    public MasterCard(String cardNumber,
                      String ownerName,
                      YearMonth cardExpDate,
                      String cvvNumbers,
                      Integer totalAmount) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.cardExpDate = cardExpDate;
        this.cvvNumbers = cvvNumbers;
        this.totalAmount = totalAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public YearMonth getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(YearMonth cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getCvvNumbers() {
        return cvvNumbers;
    }

    public void setCvvNumbers(String cvvNumbers) {
        this.cvvNumbers = cvvNumbers;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
}
