package com.example.newsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {


    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("published_date")
    @Expose
    private String published_date;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews_abstract() {
        return news_abstract;
    }

    public void setNews_abstract(String news_abstract) {
        this.news_abstract = news_abstract;
    }

    public String getUrltoImage() {
        return urltoImage;
    }

    public void setUrltoImage(String urltoImage) {
        this.urltoImage = urltoImage;
    }

    @SerializedName("byline")
    @Expose
    private String byline;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("abstract")
    @Expose
    private String news_abstract;

    @SerializedName("urlToImage")
    @Expose
    private String urltoImage;
}
