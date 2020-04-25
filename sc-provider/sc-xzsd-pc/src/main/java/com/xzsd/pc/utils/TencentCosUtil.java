package com.xzsd.pc.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @ClassName
 * @Description 腾讯云图片上传工具类
 * @Author 刘桂鹏
 * @Date 2020/4/10
 */
public class TencentCosUtil {
//    private static final String bucketName = "xzbook-1258231676";
    private static final String secretId = "AKIDd2BIwKKkbE8VeWqUZNRFrEPTG2Xxt4yb";
    private static final String secretKey = "mLdf4arJhqkqhh2WmntiGOIr99uTpypR";
    private static final String localhost = "https://xzsd-1300352294.cos.ap-chongqing.myqcloud.com";

    public static String upload(String localPackage, MultipartFile localFile) throws Exception{
        File file = multipartFileToFile(localFile);
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        Region region = new Region("ap-chongqing");
        ClientConfig clientConfig = new ClientConfig(region);
        COSClient cosClient = new COSClient(cred, clientConfig);

        String bucketName = "xzsd-1300352294";
        String key = localPackage + "/" + UUID.randomUUID()+localFile.getOriginalFilename().substring(localFile.getOriginalFilename().lastIndexOf("."));
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
        cosClient.putObject(putObjectRequest);
        return localhost + "/" + key;
    }

    static File multipartFileToFile(MultipartFile multipartFile) throws Exception{
        File file = File.createTempFile("tmp", null);
        multipartFile.transferTo(file);
        file.deleteOnExit();
        return file;
    }
}
