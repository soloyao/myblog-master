package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangocean
 * @Date: 2018/7/12 13:43
 * Describe: 文章评论点赞记录
 */
@Data
@NoArgsConstructor
public class CommentLikesRecord {

    private long id;

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 评论的id
     */
    private long pId;

    /**
     * 点赞人
     */
    private int likerId;

    /**
     * 点赞时间
     */
    private String likeDate;

    public CommentLikesRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentLikesRecord(long id, long articleId, long pId, int likerId, String likeDate) {
		super();
		this.id = id;
		this.articleId = articleId;
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

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
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

	public CommentLikesRecord(long articleId, int pId, int likerId, String likeDate) {
        this.articleId = articleId;
        this.pId = pId;
        this.likerId = likerId;
        this.likeDate = likeDate;
    }
}
