package ch.yannickhohler.depa.command.example.third_party_classes;

public class Stereo {

    public void on() {
        System.out.println("Stereo ON");
    }

    public void off() {
        System.out.println("Stereo OFF");
    }

    public void setCD() {
        System.out.println("Stereo set CD");
    }

    public void setDVD() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set Volume to: " + volume);
    }
}
