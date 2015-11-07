package com.example.roy.bookshelf;

import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.List;

public class BookDataSource {
    private static final String TAG = "BookDataSource";

    public static List<Book> sBooks;

    public static List<Book> getsBooks() {
        ParseQuery<Book> query = ParseQuery.getQuery(Book.class);
        query.findInBackground(new FindCallback<Book>() {
            @Override
            public void done(List<Book> list, ParseException e) {

                sBooks = list;
            }
        });
        return sBooks;
    }
}
