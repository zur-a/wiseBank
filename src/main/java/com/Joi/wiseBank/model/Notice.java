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
    @Column(name="notice_end_dt")
    private Date noticeEndingDate;
    @Column(name="create_dt")
    private Date createDate;
    @Column(name="update_dt")
    private Date updateDate;
}
