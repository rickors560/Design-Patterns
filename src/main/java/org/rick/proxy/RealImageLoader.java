package org.rick.proxy;

public class RealImageLoader implements ImageLoader {
    private byte[] image;

    @Override
    public void load(String imageUrl) {
        // Simulate loading the image from a remote server
        System.out.println("Loading image from " + imageUrl);
        image = new byte[10];
    }

    @Override
    public byte[] getImage() {
        return image;
    }
}
