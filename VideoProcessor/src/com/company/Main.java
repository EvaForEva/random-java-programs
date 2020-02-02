package com.company;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("nicevideo.mp4");
        video.setTitle("My nice video");
        video.setUser(new User("myvideo@domain.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new XVideoDatabase(),
                new XMailService()
        );
        processor.process(video);
    }
}
