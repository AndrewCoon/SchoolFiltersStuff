public class GuassianBlurFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        Pixel[][] ret = data;

        for (int i = 1; i < data.length-1; i++) {
            for (int j = 1; j < data[0].length-1; j++) {
                int avgR = 0;
                int avgG = 0;
                int avgB = 0;

                avgR += data[i][j].getRed() * 4;
                avgR += data[i - 1][j].getRed() * 2;
                avgR += data[i + 1][j].getRed() * 2;
                avgR += data[i][j - 1].getRed() * 2;
                avgR += data[i][j + 1].getRed() * 2;
                avgR += data[i - 1][j - 1].getRed();
                avgR += data[i + 1][j - 1].getRed();
                avgR += data[i - 1][j + 1].getRed();
                avgR += data[i + 1][j + 1].getRed();

                avgB += data[i][j].getBlue() * 4;
                avgB += data[i - 1][j].getBlue() * 2;
                avgB += data[i + 1][j].getBlue() * 2;
                avgB += data[i][j - 1].getBlue() * 2;
                avgB += data[i][j + 1].getBlue() * 2;
                avgB += data[i - 1][j - 1].getBlue();
                avgB += data[i + 1][j - 1].getBlue();
                avgB += data[i - 1][j + 1].getBlue();
                avgB += data[i + 1][j + 1].getBlue();

                avgG += data[i][j].getGreen() * 4;
                avgG += data[i - 1][j].getGreen() * 2;
                avgG += data[i + 1][j].getGreen() * 2;
                avgG += data[i][j - 1].getGreen() * 2;
                avgG += data[i][j + 1].getGreen() * 2;
                avgG += data[i - 1][j - 1].getGreen();
                avgG += data[i + 1][j - 1].getGreen();
                avgG += data[i - 1][j + 1].getGreen();
                avgG += data[i + 1][j + 1].getGreen();

                avgR /= 16;
                avgG /= 16;
                avgB /= 16;

                ret[i][j].setRed(avgR);
                ret[i][j].setBlue(avgB);
                ret[i][j].setGreen(avgG);
            }

        }
        pi.setData(ret);
    }
}
