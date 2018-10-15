package com.example.android.newsappudacity;

/**
 * An {@Link Article} object contains information related to a single article.
 */

public class Article {
    /**
     * Article section name
     */
    private String mAuthorName;

    /**
     * Article title
     */
    private String mArticleTitle;

    /**
     * Published date
     */
    private String mPublishedDate;

    /**
     * The URL of the article
     */
    private String mUrl;

    /**
     * Constructs a new Article Object
     *
     * @param author is the section that the article falls under
     * @param title   is the articles title
     * @param date    is the date the article was published
     * @param url     is the URL location of the article
     */
    public Article(String author, String title, String date, String url) {
        mAuthorName = author;
        mArticleTitle = title;
        mPublishedDate = date;
        mUrl = url;
    }

    /**
     * Getter methods to access the date
     */

    /**
     * Return the section name
     */
    public String getAuthorName() {
        return mAuthorName;
    }

    /**
     * Return the article title
     */
    public String getArticleTitle() {
        return mArticleTitle;
    }

    /**
     * Return the published date
     */
    public String getPublishedDate() {
        return mPublishedDate;
    }

    /**
     * Return the article URL
     */
    public String getUrl() {
        return mUrl;
    }
}

