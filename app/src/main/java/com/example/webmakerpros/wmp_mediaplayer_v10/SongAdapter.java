package com.example.webmakerpros.wmp_mediaplayer_v10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;


public class SongAdapter extends BaseAdapter{
    private ArrayList<Song> songs_list;
    private LayoutInflater songInflator;

    public SongAdapter(Context c, ArrayList<Song> songsL){
        songs_list = songsL;
        songInflator= LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return songs_list.size();
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return songs_list.get(position).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout song_layout = (LinearLayout)songInflator.inflate
                (R.layout.song, parent, false);
        //get title and comment views
        TextView songView = (TextView)song_layout.findViewById(R.id.song_title);
        TextView commentView = (TextView)song_layout.findViewById(R.id.song_description);
        //get song using position
        Song current_song = songs_list.get(position);
        //get title and comment strings
        songView.setText(current_song.getTitle());
        commentView.setText(current_song.getComment());
        //set position as tag
        song_layout.setTag(position);
        return song_layout;
    }
}
