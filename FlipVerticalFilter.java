public class FlipVerticalFilter implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();

        for (int i = 0; i < data.length/2; i++) {
            Pixel[] temp = data[i];

            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        pi.setData(data);
    }
}
