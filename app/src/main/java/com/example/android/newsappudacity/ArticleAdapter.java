package com.example.android.newsappudacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of earthquakes, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
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

        // Find the article at the given position in the list of earthquakes
        Article currentArticle = getItem(position);

        // Find the TextView with the ID author_name
        TextView authorName = (TextView) listItemView.findViewById(R.id.author_name);
        // Display the section_name of the current article in that TextView
        authorName.setText(currentArticle.getAuthorName());

        // Find the TextView with the ID article_title
        TextView articleTitle = (TextView) listItemView.findViewById(R.id.article_title);
        // Display the section_name of the current article in that TextView
        articleTitle.setText(currentArticle.getArticleTitle());

        // Find the TextView with the ID article_published_date
        TextView publishedDate = (TextView) listItemView.findViewById(R.id.article_published_date);
        // Display the section_name of the current article in that TextView
        publishedDate.setText(currentArticle.getPublishedDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
