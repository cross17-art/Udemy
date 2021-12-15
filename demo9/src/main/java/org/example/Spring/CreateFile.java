package org.example.Spring;

import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class CreateFile {

    private URL url;

    public CreateFile(String url) throws MalformedURLException {
        this.url = new URL(url);
    }


    public void makeDirectory(){

    }
    public URL getUrl() {
        return url;
    }

}
