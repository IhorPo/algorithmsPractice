package structuralPatterns.adapter;

import java.time.YearMonth;

public interface IVisa {
    String getCardNumber();
    String getOwnerName();
    YearMonth getCardExpDate();
    String getCvvNumbers();
    Integer getTotalAmount();
}
