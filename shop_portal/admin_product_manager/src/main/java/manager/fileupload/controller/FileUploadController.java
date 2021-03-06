package manager.fileupload.controller;
import io.swagger.annotations.Api;
import manager.fileupload.utils.FileNameUtils;
import manager.fileupload.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/file"})
@Api(value = "商品模块")
public class FileUploadController {
    private final ResourceLoader resourceLoader;
    @Autowired
    public FileUploadController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    @Value("${web.upload-path}")
    private String path;
    @Value("${web.domain}")
    private String domain;
    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public  Map<String,String> upload(MultipartFile file,String index, String orgUrl){
        // 上传成功或者失败的提示
        String orgFileName="";
        if(orgUrl!=null){
            orgFileName=orgUrl.substring(orgUrl.lastIndexOf("/")+1);
        }
        String fileName= FileNameUtils.getFileName(file.getOriginalFilename());
        //删除原来的文件
        FileUtils.deleteFile(path,orgFileName);
        ;
        Map<String,String> resultMap=new HashMap<String,String>();
        resultMap.put("index",index);
        resultMap.put("url",FileUtils.upload(file,domain,path,fileName));
        return resultMap;
    }

}
