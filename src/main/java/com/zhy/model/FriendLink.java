package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangocean
 * @Date: 2019/5/16 14:39
 * Describe:
 */
@Data
@NoArgsConstructor
public class FriendLink {

    private int id;

    /**
     * 博主
     */
    private String blogger;

    /**
     * 博主url
     */
    private String url;

    public FriendLink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FriendLink(int id, String blogger, String url) {
		super();
		this.id = id;
		this.blogger = blogger;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlogger() {
		return blogger;
	}

	public void setBlogger(String blogger) {
		this.blogger = blogger;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FriendLink(String blogger, String url){
        this.blogger = blogger;
        this.url = url;
    }

}
