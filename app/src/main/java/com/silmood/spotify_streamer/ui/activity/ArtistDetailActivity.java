package com.silmood.spotify_streamer.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;

import com.silmood.spotify_streamer.R;
import com.silmood.spotify_streamer.SpotifyStreamerComponent;
import com.silmood.spotify_streamer.common.BaseActivity;
import com.silmood.spotify_streamer.common.BasePresenter;

public class ArtistDetailActivity extends BaseActivity {

    public static Intent buildIntent (Context context){
        Intent artistDetailIntent = new Intent(context, ArtistDetailActivity.class);
        return artistDetailIntent;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_artist_detail;
    }

    @Nullable
    @Override
    protected BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void setUpComponent(SpotifyStreamerComponent appComponent) {
        //There isn't dependencies
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_artist_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
