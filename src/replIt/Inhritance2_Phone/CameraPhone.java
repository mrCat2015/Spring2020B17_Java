package replIt.Inhritance2_Phone;

public class CameraPhone extends Phone {
    int imageSize; //megapixels (for simplicity assume a pixel takes up one byte- thus megapixels equals megabytes)
                   // of each picture (i.e., 2 means each image is composed of 2 megapixels)
    int memorySize; //gigabytes (i.e., 4 means 4 Gigabytes of memory)

    public CameraPhone(int imageSize, int memorySize){
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }


}
