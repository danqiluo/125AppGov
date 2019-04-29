package com.example.representations;

public class Bill {
    private String BillID;
    private String BillNumber;
    private String BillUri;
    private String shortTitle;
    private String sponsorName;

    public Bill(String billID, String billNumber, String billUri, String shortTitle, String sponsorName) {
        BillID = billID;
        BillNumber = billNumber;
        BillUri = billUri;
        this.shortTitle = shortTitle;
        this.sponsorName = sponsorName;
    }

    public String getBillID() { return BillID; }

    public String getBillNumber() { return BillNumber; }

    public String getBillUri() { return BillUri; }

    public String getShortTitle() { return shortTitle; }

    public String getSponsorName() { return sponsorName; }
}
