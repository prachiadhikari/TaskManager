package com.prachi.taskmanager.serverresponse;

public class ImageResponse {

    public ImageResponse(String filename) {
        this.filename = filename;
    }

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
