package process;

import interfaces.Gallery;


public class ImageGallery implements Gallery {

    ImageDisplay imageDisplay;

    @Override
    public void loading (String image, String fileName) {

        if (image.equalsIgnoreCase("raw")) {
            System.out.println("Playing raw file: " + fileName);
        } else if (image.equalsIgnoreCase("jpg") ||
                image.equalsIgnoreCase("png")
        ) {
            imageDisplay = new ImageDisplay(image);
            imageDisplay.loading(image, fileName);
        } else {
            System.out.println("Invalid media! " + image + " format not supported");
        }
    }
}
