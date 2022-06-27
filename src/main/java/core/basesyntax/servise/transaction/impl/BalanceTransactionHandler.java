package core.basesyntax.servise.transaction.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.servise.transaction.TransactionHandler;

public class BalanceTransactionHandler implements TransactionHandler {
    @Override
    public void proceedTransaction(String item, int quantity) {
        if (Storage.items.get(item) != null) {
            throw new RuntimeException("Balance for " + item + "was already entered");
        }
        Storage.items.put(item, quantity);
    }
}
