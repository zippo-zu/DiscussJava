package com.zippozu.passjavaquestion;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author zp
 * @title: OSSTest
 * @projectName DiscussJava
 * @description: TODO
 * @date 2021/3/16 001617:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OSSTest {


    @Autowired
    OSSClient ossClient;

    @Test
    public void testUploadByAlicloudOss() throws FileNotFoundException {
        String bucketName = "zuppozu";
        String localFile = "C:\\Users\\Administrator\\Desktop\\hpic2805.jpg";
        String fileKeyName = "coding_java.png";
        InputStream inputStream = new FileInputStream(localFile);
        ossClient.putObject(bucketName, fileKeyName, inputStream);
        ossClient.shutdown();
    }
}
