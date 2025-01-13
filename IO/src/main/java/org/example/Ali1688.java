package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ali1688 {

//    var images = document.getElementsByTagName('img');
//    var imageUrls = [];
//
//// 提取每个图片元素的链接并存储到数组中
//for (var i = 0; i < images.length; i++) {
//        imageUrls.push(images[i].src);
//    }
//
//// 输出所有图片链接
//console.log(imageUrls);

    private static String urls = "[\n" +
            "    \"https://img.alicdn.com/imgextra/i4/O1CN01SU9YgY1vTk2sEzSbO_!!6000000006174-2-tps-20-12.png\",\n" +
            "    \"https://img.alicdn.com/imgextra/i2/O1CN016NLRwN1TPnJfbnqJF_!!6000000002375-2-tps-124-20.png\",\n" +
            "    \"https://img.alicdn.com/imgextra/i2/O1CN01is8OHl1kFZwewJrMC_!!6000000004654-2-tps-28-28.png\",\n" +
            "    \"https://img.alicdn.com/imgextra/i1/O1CN01thybfi29zFue76Xo9_!!6000000008138-2-tps-32-48.png\",\n" +
            "    \"https://img.alicdn.com/imgextra/i2/O1CN01AJcVnF1qNGHzcceff_!!6000000005483-2-tps-18-10.png\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3465895198_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3470328091_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3533085176_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3663118629_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3586834151_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3480061512_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3477323112_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3663668156_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3469318347_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3587035351_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3669314030_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3480456009_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3506345323_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3502509460_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3700696483_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3699749692_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3604984856_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3479004491_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/3539599604_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/9532461330_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/15149571729_1077859351.310x310.jpg\",\n" +
            "    \"https://cbu01.alicdn.com/img/ibank/4850246861_1077859351.310x310.jpg\",\n" +
            "    \"https://img.alicdn.com/tfs/TB1wO2zQpzqK1RjSZFoXXbfcXXa-128-128.png\",\n" +
            "    \"https://img.alicdn.com/imgextra/i3/O1CN01AuZ0NJ1LGA3aBX294_!!6000000001271-2-tps-48-48.png\",\n" +
            "    \"https://img.alicdn.com/tfs/TB1uoVPmrrpK1RjSZTEXXcWAVXa-200-200.png\"\n" +
            "]";

    public static void main(String[] args) throws IOException {

        JSONArray jsonArray = JSON.parseArray(urls);
        for (Object o : jsonArray) {
            String imageUrl = (String) o;
            if(imageUrl.contains("ibank")){
                downloadImage(imageUrl);
            }
        }
    }

    public static void downloadImage(String imageUrl) throws IOException {

        String destinationFile = "C:\\Users\\xxb\\Desktop\\pic";

        URL url = new URL(imageUrl);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        String[] urlParts = imageUrl.split("/");
        String imageName = urlParts[urlParts.length - 1];

        OutputStream outputStream = new FileOutputStream(destinationFile + File.separator + imageName);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        outputStream.close();
        inputStream.close();
        System.out.println("图片下载成功！");

    }

}
