package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangocean
 * @Date: 2018/7/7 15:44
 * Describe: 文章点赞记录
 */
@Data
@NoArgsConstructor
public class ArticleLikesRecord {

    private long id;

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 点赞人
     */
    private int likerId;

    /**
     * 点赞时间
     */
    private String likeDate;

    /**
     * 该条点赞是否已读  1--未读   0--已读
     */
    private int isRead = 1;

    public ArticleLikesRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleLikesRecord(long id, long articleId, int likerId, String likeDate, int isRead) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.likerId = likerId;
		this.likeDate = likeDate;
		this.isRead = isRead;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
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

	public int getIsRead() {
		return isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public ArticleLikesRecord(long articleId, int likerId, String likeDate) {
        this.articleId = articleId;
        this.likerId = likerId;
        this.likeDate = likeDate;
    }
}
