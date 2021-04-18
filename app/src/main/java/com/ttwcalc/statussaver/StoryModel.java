package com.ttwcalc.statussaver;

import android.net.Uri;

public class StoryModel {
    private String name, path, filename;
    private Uri uri;

    public StoryModel() {
    }

    public StoryModel(String name, String path, String filename, Uri uri) {
        this.name = name;
        this.path = path;
        this.filename = filename;
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
