package com.onlineBanking;

public class SavingAccountIMPL {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(12345678,"12-02-1234","self",true,5000,"risahv","123fgh","begusarai");
        savingAccount.setAccountNumber(1236543256);
        savingAccount.setHolderName("rishav");
        savingAccount.setAccountOpeningDate("22-05-2015");
        savingAccount.setHolderIdProof("1233455");
        savingAccount.setAvailableBalance(5000);
        savingAccount.setModeOfOperation("self");
        savingAccount.setInternetBanking(true);

        System.out.println(savingAccount.getINTEREST_RATE());
        System.out.println(savingAccount.creditBalance(2000));
        System.out.println(savingAccount.debitBalance(1000));
        System.out.println(savingAccount.showAccountBalance());
        }

    }
