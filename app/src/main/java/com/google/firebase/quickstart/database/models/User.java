package com.google.firebase.quickstart.database.models;

import android.net.Uri;

import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String displayName;
    public Uri urlPhoto;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public User(String username, String displayName, Uri urlPhoto) {
        this.username = username;
        this.displayName = displayName;
        this.urlPhoto = urlPhoto;
    }
}
// [END blog_user_class]
