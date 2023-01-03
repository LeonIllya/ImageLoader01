package application;

import process.ImageGallery;

public class GalleryPattern {

    public static void main(String[] args) {
        ImageGallery imageGallery = new ImageGallery();

        imageGallery.loading("png", "Starlight Night");
        imageGallery.loading("jpg", "Yellow house");
        imageGallery.loading("raw","The Persistence of Memory");
        imageGallery.loading("bmp", "The night Watch");
    }
}
