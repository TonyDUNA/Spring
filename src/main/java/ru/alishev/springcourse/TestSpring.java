package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class); // создается объект, который реализует объект music

//         MusicPlayer musicPlayer = new MusicPlayer(music); // пока внедрение зависимости (объекта) вручную


        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // получаем из контекста
        // musicPlayer, в качестве первого аргумента получаем id бина, в качестве второго его класс
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // вторая переменная
        // с тем же бином

//        boolean comparison = firstMusicPlayer == secondMusicPlayer; // проверяем

//        System.out.println(comparison); // true
//        System.out.println(firstMusicPlayer); // без метода toString выведет хэш объекта
//        System.out.println(secondMusicPlayer); // без метода toString выведет хэш объекта
//        System.out.println();
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.playMusicList();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}

