public class GuassianBlurFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        try {
            for (int i = 0; i < data.length; i += 3) {
                for (int j = 0; j < data[0].length - 3; j += 3) {
                    int avgR = 0, avgB = 0, avgG = 0;

                    for(int h=-1; h< 1; h++) {
                        for(int c=-1; c< 1; c++) {
                            avgR +=
                        }
                    }
                }
            }
        } catch (Exception e) {

        }

        pi.setData(data);
    }
}
