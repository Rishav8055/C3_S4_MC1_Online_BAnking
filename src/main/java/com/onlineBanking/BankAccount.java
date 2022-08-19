package com.onlineBanking;

public abstract class BankAccount {
    private int accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean internetBanking;
    private int  availableBalance;
    private final double INTEREST_RATE=7.5;

    public BankAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, int availableBalance) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getINTEREST_RATE() {
        return INTEREST_RATE;
    }
    public abstract int showAccountBalance();

    public abstract int debitBalance(int amount);

    public abstract int creditBalance(int amount);

}
