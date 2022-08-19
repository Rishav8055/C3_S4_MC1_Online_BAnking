package com.onlineBanking;

public abstract class  RecurringDepositAccount extends BankAccount {
    private int investAmount;
    private int investYearUpto;

    public RecurringDepositAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, int availableBalance, int investAmount, int investYearUpto) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, availableBalance);
        this.investAmount = investAmount;
        this.investYearUpto = investYearUpto;
    }

    public int getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(int investAmount) {
        this.investAmount = investAmount;
    }

    public int getInvestYearUpto() {
        return investYearUpto;
    }

    public void setInvestYearUpto(int investYearUpto) {
        this.investYearUpto = investYearUpto;
    }
}
