package com.Joi.wiseBank.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name="notice_details")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="notice_id")
    private int noticeId;
    @Column(name="notice_summary")
    private String noticeSummary;
    @Column(name="notice_details")
    private String noticeDetails;
    @Column(name="notic_beg_dt")
    private Date noticeBeginningDate;

    @Column(name="notic_end_dt")
    private Date noticeEndingDate;
    @Column(name="create_dt")
    private Date createDate;
    @Column(name="update_dt")
    private Date updateDate;

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeSummary() {
        return noticeSummary;
    }

    public void setNoticeSummary(String noticeSummary) {
        this.noticeSummary = noticeSummary;
    }

    public String getNoticeDetails() {
        return noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    public Date getNoticeBeginningDate() {
        return noticeBeginningDate;
    }

    public void setNoticeBeginningDate(Date noticeBeginningDate) {
        this.noticeBeginningDate = noticeBeginningDate;
    }

    public Date getNoticeEndingDate() {
        return noticeEndingDate;
    }

    public void setNoticeEndingDate(Date noticeEndingDate) {
        this.noticeEndingDate = noticeEndingDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
