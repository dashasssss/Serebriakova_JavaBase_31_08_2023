package ua.hillel.serebriakova.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}