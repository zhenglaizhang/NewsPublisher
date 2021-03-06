package com.entity;

/**
 * Created by junlai on 2017/1/5.
 */
public class Article {
    private String article_id;
    private String article_title;
    private String article_time;
    private String article_content;
    private String nav_id;

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_time() {
        return article_time;
    }

    public void setArticle_time(String article_time) {
        this.article_time = article_time;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public String getNav_id() {
        return nav_id;
    }

    public void setNav_id(String nav_id) {
        this.nav_id = nav_id;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id='" + article_id + '\'' +
                ", article_title='" + article_title + '\'' +
                ", article_time='" + article_time + '\'' +
                ", article_content='" + article_content + '\'' +
                ", nav_id='" + nav_id + '\'' +
                '}';
    }

    public Article() {
        super();
    }
}
