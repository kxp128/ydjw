package com.ehootu.census.model;

public class BusinessBankAccounts {
    private Integer businessBankId;

    private Integer businessId;

    private String bankUser;

    private String bankName;

    private String openAccountArea;

    private String bankBranch;

    private String bankNumber;

    private Integer created;

    public Integer getBusinessBankId() {
        return businessBankId;
    }

    public void setBusinessBankId(Integer businessBankId) {
        this.businessBankId = businessBankId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser == null ? null : bankUser.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getOpenAccountArea() {
        return openAccountArea;
    }

    public void setOpenAccountArea(String openAccountArea) {
        this.openAccountArea = openAccountArea == null ? null : openAccountArea.trim();
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch == null ? null : bankBranch.trim();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}