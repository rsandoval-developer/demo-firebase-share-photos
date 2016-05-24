package com.google.firebase.quickstart.database.viewholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.quickstart.database.DetailActivity;
import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private final ImageView photo;
    private final Button actionButton;
    public TextView titleView;
    public TextView authorView;
    public ImageView starView;
    public TextView numStarsView;
    public TextView bodyView;

    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = (TextView) itemView.findViewById(R.id.post_title);
        //authorView = (TextView) itemView.findViewById(R.id.post_author);
        starView = (ImageView) itemView.findViewById(R.id.star);
        numStarsView = (TextView) itemView.findViewById(R.id.post_num_stars);
        bodyView = (TextView) itemView.findViewById(R.id.post_body);
        photo = (ImageView) itemView.findViewById(R.id.photo);
        actionButton = (Button) itemView.findViewById(R.id.action_button);

    }

    public void bindToPost(final Context context, final Post post, View.OnClickListener starClickListener) {
        titleView.setText(post.title);
        //authorView.setText(post.author);
        numStarsView.setText(String.valueOf(post.starCount));
        bodyView.setText(post.body);


        Glide.with(context)
                .load(post.urlPhoto)
                .into(photo);

        actionButton.setOnClickListener(starClickListener);

       /* actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("url", post.urlPhoto);
                intent.putExtra("title", post.title);
                context.startActivity(intent);
            }
        });*/


    }
}
