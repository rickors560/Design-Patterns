package org.rick.proxy;

public interface ImageLoader {
    void load(String imageUrl);

    byte[] getImage();
}
