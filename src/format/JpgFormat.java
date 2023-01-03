package format;

import interfaces.ForwardGallery;

public class JpgFormat implements ForwardGallery {

    @Override
    public void JpgFormat (String fileName) {
        System.out.println("Playing jpg file: "+ fileName);
    }

    @Override
    public void PngFormat(String fileName) {

    }
}
