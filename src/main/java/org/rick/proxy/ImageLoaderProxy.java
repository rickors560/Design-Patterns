package org.rick.proxy;

public class ImageLoaderProxy implements ImageLoader {
    private RealImageLoader realImageLoader;
    private String imageUrl;

    public ImageLoaderProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void load(String imageUrl) {
        if (realImageLoader == null) {
            realImageLoader = new RealImageLoader();
            realImageLoader.load(imageUrl);
        }
    }

    @Override
    public byte[] getImage() {
        if (realImageLoader == null) {
            load(imageUrl);
        }
        return realImageLoader.getImage();
    }
}
