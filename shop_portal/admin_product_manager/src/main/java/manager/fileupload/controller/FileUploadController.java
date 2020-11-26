package manager.fileupload.controller;
import io.swagger.annotations.Api;
import manager.fileupload.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
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
    /**
     * @param file 要上传的文件
     * @return
     */
    @RequestMapping("upload")
    public String upload(@RequestParam("fileName") MultipartFile file, Map<String, Object> map){
        //要上传的目标文件存放路径
        String localPath = "H:/fileupload";
        // 上传成功或者失败的提示
        String msg = "";
        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            msg = "上传成功！";
        }else {
            msg = "上传失败！";
        }
        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());
        return "forward:/test";
    }
    /**
     * 显示单张图片
     * @return
     */
    @RequestMapping("show")
    public ResponseEntity showPhotos(String fileName){
        try {
            // 由于是读取本机的文件，file是一定要加上的， path是在application配置文件中的路径
            return ResponseEntity.ok(resourceLoader.getResource("file:" + path + fileName));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
