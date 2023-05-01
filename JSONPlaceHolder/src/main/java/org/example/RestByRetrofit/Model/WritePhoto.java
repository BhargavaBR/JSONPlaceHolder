package org.example.RestByRetrofit.Model;

import org.example.RestByRetrofit.RestClient;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class WritePhoto {
    public void writeImages(RestClient restClient) throws IOException {
        var apiResponse = restClient.getApi().getPhtotos().execute();


        int albumId=1,i=0;
        while(albumId<=10){
            int count=0;
            while(count<2){
                String url = apiResponse.body().get(i).getUrl();
                BufferedImage image = ImageIO.read(new URL(url));
                String prefix = albumId+"_"+apiResponse.body().get(i).getId();
                System.out.println(prefix+" is creating!");
                String base = "G:\\ScalerProjectModule\\JSONPlaceHolder\\JSONPlaceHolder\\Photos";
                File outputFile = new File(base+"\\"+prefix);
                ImageIO.write(image,"png", outputFile);
                count++;
                i++;
            }
            albumId++;
            i=i+50;
        }
        System.out.println("Photos are created!");
    }
}
