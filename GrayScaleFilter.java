public class GrayScaleFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                int num = (data[i][j].getBlue() + data[i][j].getGreen() + data[i][j].getRed())/3;
                data[i][j].setBlue(num);
                data[i][j].setGreen(num);
                data[i][j].setRed(num);
            }
        }   
        
        pi.setData(data);
    }
}
