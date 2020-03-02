package com.zhy.model;

import lombok.Data;

/**
 * @author: zhangocean
 * @Date: 2018/7/23 17:17
 * Describe: 反馈
 */
@Data
public class FeedBack {

    private int id;

    /**
     * 反馈内容
     */
    private String feedbackContent;

    /**
     * 联系方式
     */
    private String contactInfo;

    /**
     * 反馈人
     */
    private int personId;

    /**
     * 反馈时间
     */
    private String feedbackDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedbackContent() {
		return feedbackContent;
	}

	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public FeedBack(int id, String feedbackContent, String contactInfo, int personId, String feedbackDate) {
		super();
		this.id = id;
		this.feedbackContent = feedbackContent;
		this.contactInfo = contactInfo;
		this.personId = personId;
		this.feedbackDate = feedbackDate;
	}

	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}

}
