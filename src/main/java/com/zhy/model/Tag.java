package com.zhy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangocean
 * @Date: 2018/6/20 15:36
 * Describe: 标签
 */
@Data
@NoArgsConstructor
public class Tag {

    private int id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签大小
     */
    private int tagSize;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagSize() {
		return tagSize;
	}

	public void setTagSize(int tagSize) {
		this.tagSize = tagSize;
	}

	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tag(String tagName, int tagSize) {
        this.tagName = tagName;
        this.tagSize = tagSize;
    }
}
