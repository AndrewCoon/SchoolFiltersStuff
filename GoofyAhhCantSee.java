public class GoofyAhhCantSee implements Filter {
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();    
        
   
        // for (int i = 0; i < data.length; i++) {
        //     for (int j = 0; j < data.length; j++) {
        //         data[i][j] = data[Math.random()-1][Math.rint(j)];
        //     }
        // }
        
        
        
         pi.setData(data);
     }
}
