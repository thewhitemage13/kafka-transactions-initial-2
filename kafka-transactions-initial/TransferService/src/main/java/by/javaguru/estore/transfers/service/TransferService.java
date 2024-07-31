package by.javaguru.estore.transfers.service;

import by.javaguru.estore.transfers.model.TransferRestModel;

public interface TransferService {
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
