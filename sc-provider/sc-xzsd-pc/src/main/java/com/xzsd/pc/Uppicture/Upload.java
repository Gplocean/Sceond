package com.xzsd.pc.Uppicture;

import com.neusoft.core.restful.AppResponse;

import com.xzsd.pc.utils.TencentCosUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName
 * @Description
 * @Author lwb
 * @Date 2020/4/10
 */
@RestController
@RequestMapping(value = "/picture")
public class Upload {

    @RequestMapping(value = "upload")
    public AppResponse upload(@RequestParam("multipartFile") MultipartFile multipartFile){
        try{
            String imagesUrl = TencentCosUtil.upload("images", multipartFile);
            return AppResponse.success("图片上传成功",imagesUrl);
        }catch (Exception e){
            return AppResponse.clientError("图片上传失败，重新上传");
        }
    }
}
