package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String playMusic(){
        if(musicList.isEmpty()){
            return "No songs in this playlist";
        }

        Random random = new Random();
        int randomSong = random.nextInt(musicList.size());
        return "Playing: " + musicList.get(randomSong).getSong();
    }
}
