public class GuassianBlurFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        
        for (int i = 0; i < data.length; i+=3) {
            for (int j = 0; j < data[0].length; j+=3) {
                data[i][j].setBlue(255-data[i][j].getBlue());
                data[i][j].setGreen(255-data[i][j].getGreen());
                data[i][j].setRed(255-data[i][j].getRed());
            }
        }   
        
        pi.setData(data);
    }
}
