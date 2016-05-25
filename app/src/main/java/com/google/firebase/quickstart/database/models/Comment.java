package com.google.firebase.quickstart.database.models;

import android.net.Uri;

import com.google.firebase.database.IgnoreExtraProperties;

// [START comment_class]
@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;
    public String displayName;
    public Uri urlPhoto;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text, String displayName, Uri urlPhoto) {
        this.uid = uid;
        this.author = author;
        this.text = text;
        this.displayName = displayName;
        this.urlPhoto = urlPhoto;
    }
}
// [END comment_class]
