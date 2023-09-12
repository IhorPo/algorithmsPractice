package structuralPatterns.adapter;

import java.time.YearMonth;

public class VisaAdapter implements IVisa{
    private String cardNumber;
    private String ownerName;
    private YearMonth cardExpDate;
    private String cvvNumbers;
    private Integer totalAmount;

    private final MasterCard masterCard;

    public VisaAdapter(MasterCard masterCard){
        this.masterCard = masterCard;
        setParam();
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public YearMonth getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(YearMonth cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    @Override
    public String getCvvNumbers() {
        return cvvNumbers;
    }

    public void setCvvNumbers(String cvvNumbers) {
        this.cvvNumbers = cvvNumbers;
    }

    @Override
    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setParam(){
        setCardNumber(this.masterCard.getCardNumber());
        setOwnerName(this.masterCard.getOwnerName());
        setCardExpDate(this.masterCard.getCardExpDate());
        setCvvNumbers(this.masterCard.getCvvNumbers());
        setTotalAmount(this.masterCard.getTotalAmount());
    }
}
