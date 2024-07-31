package by.javaguru.payments.ws.core.events;

import java.math.BigDecimal;

public class WithdrawalRequestedEvent {
    private String senderId;
    private String recepientId;
    private BigDecimal amount;

    public WithdrawalRequestedEvent() {

    }

    public WithdrawalRequestedEvent(String senderId, String recepientId, BigDecimal amount) {
        this.senderId = senderId;
        this.recepientId = recepientId;
        this.amount = amount;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getRecepientId() {
        return recepientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setRecepientId(String recepientId) {
        this.recepientId = recepientId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
 
}