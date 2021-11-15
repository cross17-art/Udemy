package com.company.Task48;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    //start song list
    private class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            return songs.add(song);
        }

        private Song findSong(String title) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getTitle().equals(title)) {
                    return songs.get(i);
                }
            }

            return null;
        }

        private Song findSong(int trackNumber) {
            if (songs.size() < trackNumber || trackNumber <= 0 || songs.get(trackNumber - 1) == null) {
                return null;
            }

            return songs.get(trackNumber - 1);
        }
    }
//    end sonlist


    public boolean addSong(String songTitle, double songDuration) {
        if (songs.findSong(songTitle) != null) {
            return false;
        }
        return songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int track_number, LinkedList<Song> playlist) {
        Song searchedSong;
        searchedSong = songs.findSong(track_number);
        if (searchedSong != null) {
            return playlist.add(searchedSong);
        }
        return false;
    }

    public boolean addToPlayList(String title_song, LinkedList<Song> playlist) {
        Song optionalSong = songs.findSong(title_song);
        if (optionalSong == null) {
            return false;
        }
        return playlist.add(optionalSong);
    }
}


