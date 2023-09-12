package structuralPatterns.adapter;

import java.time.YearMonth;

public interface IMasterCard {
    String getCardNumber();
    String getOwnerName();
    YearMonth getCardExpDate();
    String getCvvNumbers();
    Integer getTotalAmount();
}
