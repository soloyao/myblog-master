package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: zhangocean
 * @Date: 2019/5/6 15:39
 * Describe: 用户评论留言未读数
 */
@Data
@NoArgsConstructor
public class UserReadNews implements Serializable{

    /**
     * 留言+评论未读数
     */
    private int allNewsNum;

    /**
     * 评论未读数
     */
    private int commentNum;

    /**
     * 留言未读数
     */
    private int leaveMessageNum;

    public int getAllNewsNum() {
		return allNewsNum;
	}

	public void setAllNewsNum(int allNewsNum) {
		this.allNewsNum = allNewsNum;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getLeaveMessageNum() {
		return leaveMessageNum;
	}

	public void setLeaveMessageNum(int leaveMessageNum) {
		this.leaveMessageNum = leaveMessageNum;
	}

	public UserReadNews(int allNewsNum, int commentNum, int leaveMessageNum) {
        this.allNewsNum = allNewsNum;
        this.commentNum = commentNum;
        this.leaveMessageNum = leaveMessageNum;
    }
}
