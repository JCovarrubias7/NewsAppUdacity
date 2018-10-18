package com.example.android.newsappudacity;

/**
 * An {@Link Article} object contains information related to a single article.
 */

public class Article {
    /**
     * Article author name
     */
    private String mAuthorName;

    /**
     * Article section name
     */
    private String mSectionName;

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
     * @param author  is the author of the article
     * @param section is the section that the article falls under
     * @param title   is the articles title
     * @param date    is the date the article was published
     * @param url     is the URL location of the article
     */
    public Article(String author, String section, String title, String date, String url) {
        mAuthorName = author;
        mSectionName = section;
        mArticleTitle = title;
        mPublishedDate = date;
        mUrl = url;
    }

    /**
     * Getter methods to access the date
     */

    /**
     * Return the author name
     */
    public String getAuthorName() {
        return mAuthorName;
    }

    /**
     * Return the section name
     */
    public String getSectionNAme() {
        return mSectionName;
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

