package process;

import format.JpgFormat;
import format.PngFormat;
import interfaces.ForwardGallery;
import interfaces.Gallery;

public class ImageDisplay implements Gallery {

    ForwardGallery forwardGallery;

    public ImageDisplay(String image) {

        if (image.equalsIgnoreCase("jpg")) {
            forwardGallery = new JpgFormat();
        } else if (image.equalsIgnoreCase("png")) {
            forwardGallery = new PngFormat();
        }
    }

    @Override
    public void loading (String image, String fileName) {

        if (image.equalsIgnoreCase("jpg")) {
            forwardGallery.JpgFormat(fileName);
        } else if (image.equalsIgnoreCase("png")) {
            forwardGallery.PngFormat(fileName);
        }
    }
}
