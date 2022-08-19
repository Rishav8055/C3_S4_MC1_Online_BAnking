package com.onlineBanking;

public class SavingAccount extends BankAccount{

    private String holderName;
    private String holderIdProof;
    private String holderAddress;

    public SavingAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, int availableBalance, String holderName, String holderIdProof, String holderAddress) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, availableBalance);
        this.holderName = holderName;
        this.holderIdProof = holderIdProof;
        this.holderAddress = holderAddress;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderIdProof() {
        return holderIdProof;
    }

    public void setHolderIdProof(String holderIdProof) {
        this.holderIdProof = holderIdProof;
    }

    public String getHolderAddress() {
        return holderAddress;
    }

    public void setHolderAddress(String holderAddress) {
        this.holderAddress = holderAddress;
    }
    @Override
    public int showAccountBalance(){
        return getAvailableBalance();
    }
    @Override
    public int creditBalance(int amount){
        return getAvailableBalance();

    }

    @Override
    public int debitBalance(int amount) {
        return getAvailableBalance()-amount;
    }
}
