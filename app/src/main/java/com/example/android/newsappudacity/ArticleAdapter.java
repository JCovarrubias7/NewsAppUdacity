package com.example.android.newsappudacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * The first publication date is attached to the time in the JSON response.
     * We are going to set the place where we are going to split the data {"2018-09-29T08:00:13Z"}.
     */
    private static final String TIME_SEPARATOR = "T";

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        // Find the TextView with the ID author_name
        TextView authorName = (TextView) listItemView.findViewById(R.id.author_name);
        // Display the section_name of the current article in that TextView
        authorName.setText(currentArticle.getAuthorName());

        // Find the TextView with the ID article_title
        TextView articleTitle = (TextView) listItemView.findViewById(R.id.article_title);
        // Display the section_name of the current article in that TextView
        articleTitle.setText(currentArticle.getArticleTitle());

        // Get the original published date so we can separate it form the time {"2018-09-29T08:00:13Z"}
        String originalPublishedDate = currentArticle.getPublishedDate();

        // Store the date in its own variable after we separate it from the publishing date
        String date;

        // Split the publishing date {"2018-09-29"} {"T08:00:13Z"}
        String[] parts = originalPublishedDate.split(TIME_SEPARATOR);

        // Set the first part to the date string initialized earlier {"2018-09-29"}
        date = parts[0];

        // Find the TextView with the ID article_published_date
        TextView publishedDate = (TextView) listItemView.findViewById(R.id.article_published_date);
        // Display the date of the current article in that TextView
        publishedDate.setText(date);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
