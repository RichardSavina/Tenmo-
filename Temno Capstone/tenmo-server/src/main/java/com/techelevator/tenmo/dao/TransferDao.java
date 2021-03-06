package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;

import java.math.BigDecimal;
import java.util.List;

public interface TransferDao {


    public Transfer getTransferDetails(Long transferId);

    List<Transfer> findAllTransfers(Long userId);

     Transfer makeTransfer(Transfer transfer);
}
