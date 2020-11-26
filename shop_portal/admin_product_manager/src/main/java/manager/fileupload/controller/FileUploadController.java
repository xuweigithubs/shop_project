package manager.fileupload.controller;
import io.swagger.annotations.Api;
import manager.fileupload.utils.FileNameUtils;
import manager.fileupload.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
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
    @RequestMapping("upload")
    public String upload(MultipartFile file){
        // 上传成功或者失败的提示
        String fileName= FileNameUtils.getFileName(file.getOriginalFilename());
        return FileUtils.upload(file,domain,path,fileName);
    }

}
