package com.usMobile.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Daily_Usage")
public class Daily_Usage {
    private String _id;
    private String mdn;
    private Object userId;
    private String usageDate;
    private int usedInMb;

    public Daily_Usage() {
    }

    /**
     * gets mdn
     * @return mdn
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * sets mdn
     * @param mdn
     */
    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    /**
     * gets _id
     * @return _id
     */
    public String get_id() {
        return _id;
    }

    /**
     * sets _id
     * @param _id
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * gets userId
     * @return userId
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * sets userId
     * @param userId
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     * gets usageDate
     * @return usageDate
     */
    public String getUsageDate() {
        return usageDate;
    }

    /**
     * sets setUsageDate
     * @param usageDate
     */
    public void setUsageDate(String usageDate) {
        this.usageDate = usageDate;
    }

    /**
     * gets usedInMb
     * @return usedInMb
     */
    public int getUsedInMb() {
        return usedInMb;
    }

    /**
     * sets usedInMb
     * @param usedInMb
     */
    public void setUsedInMb(int usedInMb) {
        this.usedInMb = usedInMb;
    }

    /**
     *
     * @return a string with the entire object info
     */
    @Override
    public String toString() {
        return "Daily_Usage{" +
                "_id=" + _id +
                ", mdn='" + mdn + '\'' +
                ", userId=" + userId +
                ", usageDate='" + usageDate + '\'' +
                ", usedInMb=" + usedInMb +
                '}';
    }
}
