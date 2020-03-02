package com.zhy.model;

import lombok.Data;

/**
 * @author: zhangocean
 * @Date: 2018/6/20 15:34
 * Describe: 文章
 */
@Data
public class Article {

    private static final long serialVersionUID = 1L;

    private int id;

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 文章作者
     */
    private String author;

    /**
     * 文章原作者
     */
    private String originalAuthor;

    /**
     * 文章名
     */
    private String articleTitle;

    /**
     * 发布时间
     */
    private String publishDate;

    /**
     * 最后一次修改时间
     */
    private String updateDate;

    /**
     * 文章内容
     */
    private String articleContent;

    /**
     * 文章标签
     */
    private String articleTags;

    /**
     * 文章类型
     */
    private String articleType;

    /**
     * 博客分类
     */
    private String articleCategories;


    /**
     * 原文链接
     * 转载：则是转载的链接
     * 原创：则是在本博客中的链接
     */
    private String articleUrl;

    /**
     * 文章摘要
     */
    private String articleTabloid;

    /**
     * 上一篇文章id
     */
    private long lastArticleId;

    /**
     * 下一篇文章id
     */
    private long nextArticleId;

    /**
     * 喜欢
     */
    private int likes = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getOriginalAuthor() {
		return originalAuthor;
	}

	public void setOriginalAuthor(String originalAuthor) {
		this.originalAuthor = originalAuthor;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleTags() {
		return articleTags;
	}

	public void setArticleTags(String articleTags) {
		this.articleTags = articleTags;
	}

	public String getArticleType() {
		return articleType;
	}

	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}

	public String getArticleCategories() {
		return articleCategories;
	}

	public void setArticleCategories(String articleCategories) {
		this.articleCategories = articleCategories;
	}

	public String getArticleUrl() {
		return articleUrl;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	public String getArticleTabloid() {
		return articleTabloid;
	}

	public void setArticleTabloid(String articleTabloid) {
		this.articleTabloid = articleTabloid;
	}

	public long getLastArticleId() {
		return lastArticleId;
	}

	public void setLastArticleId(long lastArticleId) {
		this.lastArticleId = lastArticleId;
	}

	public long getNextArticleId() {
		return nextArticleId;
	}

	public void setNextArticleId(long nextArticleId) {
		this.nextArticleId = nextArticleId;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Article(int id, long articleId, String author, String originalAuthor, String articleTitle,
			String publishDate, String updateDate, String articleContent, String articleTags, String articleType,
			String articleCategories, String articleUrl, String articleTabloid, long lastArticleId, long nextArticleId,
			int likes) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.author = author;
		this.originalAuthor = originalAuthor;
		this.articleTitle = articleTitle;
		this.publishDate = publishDate;
		this.updateDate = updateDate;
		this.articleContent = articleContent;
		this.articleTags = articleTags;
		this.articleType = articleType;
		this.articleCategories = articleCategories;
		this.articleUrl = articleUrl;
		this.articleTabloid = articleTabloid;
		this.lastArticleId = lastArticleId;
		this.nextArticleId = nextArticleId;
		this.likes = likes;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

}
