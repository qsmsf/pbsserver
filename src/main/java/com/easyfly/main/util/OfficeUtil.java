package com.easyfly.main.util;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;
import java.util.Map;

public class OfficeUtil {
    public static ByteArrayOutputStream buildWord(File tmpFile, Map<String, String> contentMap) throws Exception {
        //替换标签 ${tag}
        FileInputStream tempFileInputStream = new FileInputStream(tmpFile);
        HWPFDocument document = new HWPFDocument(tempFileInputStream);
        // 读取文本内容
        Range bodyRange = document.getRange();
        // 替换内容
        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }

        //导出到文件
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.write(byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
