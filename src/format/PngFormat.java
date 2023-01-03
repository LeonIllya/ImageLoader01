package format;

import interfaces.ForwardGallery;

public class PngFormat implements ForwardGallery {

    @Override
    public void PngFormat (String fileName) {
        System.out.println("Playing png file: "+ fileName);
    }

    @Override
    public void JpgFormat(String fileName) {

    }

}
