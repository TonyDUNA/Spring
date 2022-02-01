package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    // Зависимость внедряется извне (IoC) - через конструктор
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public MusicPlayer() { // создаем пустой конструктор
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusicList() {
        // больше не создаем объекты
        // код для воспроизведения музыки...
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}


