package manager.fileupload.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    /**
     * 上传图片
     *
     * @param file     文件
     * @param path     文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static String upload(MultipartFile file, String domain, String path, String fileName) {
        //使用原文件名
        String realPath = path + "/" + fileName;
        File dest = new File(realPath);
        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            //保存文件
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return domain + fileName;
    }

    public static void deleteFile(String path, String fileName) {
        //使用原文件名
        String realPath = path + "/" + fileName;
        File dest = new File(realPath);
        try {
            //删除文件
            dest.delete();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

