package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangocean
 * @Date: 2018/7/16 15:26
 * Describe: 留言中点赞
 */
@Data
@NoArgsConstructor
public class LeaveMessageLikesRecord {

    private long id;

    /**
     * 文章页
     */
    private String pageName;

    /**
     * 评论的id
     */
    private int pId;

    /**
     * 点赞人
     */
    private int likerId;

    /**
     * 点赞时间
     */
    private String likeDate;

    public LeaveMessageLikesRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveMessageLikesRecord(long id, String pageName, int pId, int likerId, String likeDate) {
		super();
		this.id = id;
		this.pageName = pageName;
		this.pId = pId;
		this.likerId = likerId;
		this.likeDate = likeDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getLikerId() {
		return likerId;
	}

	public void setLikerId(int likerId) {
		this.likerId = likerId;
	}

	public String getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(String likeDate) {
		this.likeDate = likeDate;
	}

	public LeaveMessageLikesRecord(String pageName, int pId, int likerId, String likeDate) {
        this.pageName = pageName;
        this.pId = pId;
        this.likerId = likerId;
        this.likeDate = likeDate;
    }
}
