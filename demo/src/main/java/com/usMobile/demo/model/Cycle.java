package com.usMobile.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cycle")
public class Cycle {
    private Object _id;
    private String mdn;
    private String startDate;
    private String endDate;
    private Object userId;

    public Cycle() {
    }

    /**
     * returns _id
     * @return _id
     */
    public Object get_id() {
        return _id;
    }

    /**
     * sets _id
     * @param _id
     */
    public void set_id(Object _id) {
        this._id = _id;
    }

    /**
     * returns mdn
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
     * returns startDate
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * sets starDate
     * @param starDate
     */
    public void setStartDate(String starDate) {
        this.startDate = starDate;
    }

    /**
     * returns endDate
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * sets endDate
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * returns userId
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
     *
     * @return a string with the entire object info
     */
    @Override
    public String toString() {
        return "Cycle{" +
                "mdn='" + mdn + '\'' +
                ", _id=" + _id +
                ", starDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", userId=" + userId +
                '}';
    }
}
