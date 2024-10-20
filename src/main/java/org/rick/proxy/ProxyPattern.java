package org.rick.proxy;

public class ProxyPattern {

    // Provides a surrogate or placeholder for another object to control access to it.
    public static void main(String[] args) {
        ImageLoader imageLoader1 = new ImageLoaderProxy("image1.jpg");
        imageLoader1.load("image1.jpg");
        byte[] image1 = imageLoader1.getImage();

        ImageLoader imageLoader2 = new ImageLoaderProxy("image2.jpg");
        imageLoader2.load("image2.jpg");
        byte[] image2 = imageLoader2.getImage();
    }
}
