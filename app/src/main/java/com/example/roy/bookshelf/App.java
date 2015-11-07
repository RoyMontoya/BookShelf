package com.example.roy.bookshelf;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "7tcZjcyb1wRKmBbjS1IgJNl5Nkejvz94bRAVlMu1", "wHTNStyTyhiV3O8SPj4ckBpXYkvEO3Hp5xss5X47");

    }
}
