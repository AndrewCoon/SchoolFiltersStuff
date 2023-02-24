public class GuassianBlurFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        Pixel[][] ret = data;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                int avgR = 0;
                int avgG = 0;
                int avgB = 0; 
                if(i==0&&j==0) {
                    avgR += data[i][j].getRed() * 4;
                    avgR += data[i+1][j].getRed() * 2;
                    avgR += data[i][j+1].getRed() * 2;
                    avgR += data[i+1][j+1].getRed();
                }
                
                
                avgR /= 16;
                
                ret[i][j].setRed(avgR);
            }
        }   
        
        pi.setData(data);
    }
}
