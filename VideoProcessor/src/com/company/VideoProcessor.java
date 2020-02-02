package com.company;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private MailService mailService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            MailService mailService) {
        this.encoder = encoder;
        this.database = database;
        this.mailService = mailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        mailService.sendEmail(video.getUser());
    }
}
