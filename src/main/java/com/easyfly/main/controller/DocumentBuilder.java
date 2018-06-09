package com.easyfly.main.controller;

import com.easyfly.main.bean.PbsRecordWithBLOBs;
import com.easyfly.main.bean.RectSize;
import com.easyfly.main.bean.SysUploadFile;
import com.easyfly.main.bean.ViewRecord2WordWithBLOBs;
import com.easyfly.main.dao.PbsRecordMapper;
import com.easyfly.main.dao.SysUploadFileMapper;
import com.easyfly.main.dao.ViewRecord2WordMapper;
import com.easyfly.main.util.CommonUtils;
import com.easyfly.main.util.Constant;
import com.easyfly.main.util.CustomXWPFDocument;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import static com.sun.tools.doclint.Entity.image;

@Component
public class DocumentBuilder {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ViewRecord2WordMapper viewRecord2WordMapper;
    @Autowired
    private SysUploadFileMapper sysUploadFileMapper;
    @Autowired
    private PbsRecordMapper pbsRecordMapper;

    @Async
    public void wordBuild(int recId, String filePath) throws IOException{
        ViewRecord2WordWithBLOBs record = viewRecord2WordMapper.selectByRecId(recId);
        List<SysUploadFile> fileList = sysUploadFileMapper.selectByUuid(record.getUuid());

        //String fileName = filePath + "model - 副本.docx";
        int rsl = readwriteWord(filePath, record, fileList);
    }

    /**读取并操作word2007中的内容*/
    public int readwriteWord(String filePath ,ViewRecord2WordWithBLOBs record, List<SysUploadFile> fileList) throws IOException{
        String fileName = filePath + record.getRecordNo()+".docx";
        //调试
        //fileName = filePath+ "model - 副本.docx";
        File src = new File(filePath+ "model.docx");
        File destFile = new File (fileName);
        CommonUtils.copyFileUsingFileChannels(src, destFile);

        //CommonUtils.copyFile(filePath+ "model.docx", fileName);
        File isExist = new File(fileName);
        /**判断源文件是否存在*/
        if(!isExist.exists()){
            return  1;//"源文件不存在！";
        }
        int ztNum = 0;
        int picNum = 0;
        List<SysUploadFile> ztList = new ArrayList<>();
        List<SysUploadFile> picList = new ArrayList<>();
        for (SysUploadFile file : fileList) {
            if(file.getFileType() == 2004){
                ztNum++;
                ztList.add(file);
            }else if(file.getFileType() == 2001 || file.getFileType() == 2002 || file.getFileType() == 2003){
                picNum++;
                picList.add(file);
            }
        }
        CustomXWPFDocument document;
        try {
            /**打开word2007的文件*/
            OPCPackage opc = POIXMLDocument.openPackage(fileName);
            document = new CustomXWPFDocument(opc);
            /**替换word2007的纯文本内容*/
            List<XWPFRun> listRun;
            List<XWPFParagraph> listParagraphs = document.getParagraphs();
            Calendar c = Calendar.getInstance();
            for (int i = 0; i < listParagraphs.size(); i++) {
                listRun = listParagraphs.get(i).getRuns();
                for (int j = 0; j < listRun.size(); j++) {
                    if("#{kyYear}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyDate());
                        listRun.get(j).setText(c.get(Calendar.YEAR)+"",0);
                    }else if("#{recNo}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getRecordNo().substring(record.getRecordNo().length()-5),0);
                    }else if("#{bgUnitName}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getKyUnitName(),0);
                    }else if("#{kyUnitName}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getKyUnitName(),0);
                    }else if("#{jjYear}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getJjTime());
                        listRun.get(j).setText(c.get(Calendar.YEAR)+"",0);
                    }else if("#{jjMonth}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getJjTime());
                        listRun.get(j).setText(c.get(Calendar.MONTH)+1+"",0);
                    }else if("#{jjDay}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getJjTime());
                        listRun.get(j).setText(c.get(Calendar.DAY_OF_MONTH)+"",0);
                    }else if("#{jjHour}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getJjTime());
                        listRun.get(j).setText(c.get(Calendar.HOUR_OF_DAY)+"",0);
                    }else if("#{jjMin}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getJjTime());
                        listRun.get(j).setText(c.get(Calendar.MINUTE)+"",0);
                    }else if("#{kysy}#".equals(listRun.get(j).getText(0))){
                        String kysy = record.getKysy();
                        if(kysy == null){
                            kysy = "";
                        }
                        for(int t = 0 ; t<280 ;t++){
                            kysy += " ";
                        }
                        listRun.get(j).setText(kysy,0);
                    }else if("#{ksYear}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyksTime());
                        listRun.get(j).setText(c.get(Calendar.YEAR)+"",0);
                    }else if("#{ksMonth}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyksTime());
                        listRun.get(j).setText(c.get(Calendar.MONTH)+"",0);
                    }else if("#{ksDay}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyksTime());
                        listRun.get(j).setText(c.get(Calendar.DAY_OF_MONTH)+"",0);
                    }else if("#{ksHour}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyksTime());
                        listRun.get(j).setText(c.get(Calendar.HOUR_OF_DAY)+"",0);
                    }else if("#{ksMin}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyksTime());
                        listRun.get(j).setText(c.get(Calendar.MINUTE)+"",0);
                    }else if("#{jsYear}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyjsTime());
                        listRun.get(j).setText(c.get(Calendar.YEAR)+"",0);
                    }else if("#{jsMonth}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyjsTime());
                        listRun.get(j).setText(c.get(Calendar.MONTH)+"",0);
                    }else if("#{jsDay}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyjsTime());
                        listRun.get(j).setText(c.get(Calendar.DAY_OF_MONTH)+"",0);
                    }else if("#{jsHour}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyjsTime());
                        listRun.get(j).setText(c.get(Calendar.HOUR_OF_DAY)+"",0);
                    }else if("#{jsMin}#".equals(listRun.get(j).getText(0))){
                        c.setTime(record.getKyjsTime());
                        listRun.get(j).setText(c.get(Calendar.MINUTE)+"",0);
                    }else if("#{xcdd}#".equals(listRun.get(j).getText(0))){
                        String xcdd = record.getFsqy()+record.getXcwz();
                        listRun.get(j).setText(xcdd,0);
                    }else if("#{bhflag}#".equals(listRun.get(j).getText(0))){
                        String bhflag = record.getBhFlag() == 1 ? "有" : "无";
                        listRun.get(j).setText(bhflag,0);
                    }else if("#{bhr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getBhrName(),0);
                    }else if("#{bhrUnitName}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getBhrUnitName(),0);
                    }else if("#{bhrZw}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getBhrZw(),0);
                    }else if("#{func1}#".equals(listRun.get(j).getText(0))){
                        if(record.getBhfs() != null && record.getBhfs().equals("专人看护现场，防止他人进入")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{func2}#".equals(listRun.get(j).getText(0))){
                        if(record.getBhfs() != null && record.getBhfs().equals("设立警戒带，划定禁行区域")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{func3}#".equals(listRun.get(j).getText(0))){
                        if(record.getBhfs() != null && !record.getBhfs().equals("设立警戒带，划定禁行区域") && !record.getBhfs().equals("专人看护现场，防止他人进入")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{funcOther}#".equals(listRun.get(j).getText(0))){
                        if(record.getBhfs() != null && !record.getBhfs().equals("设立警戒带，划定禁行区域") && !record.getBhfs().equals("专人看护现场，防止他人进入")){
                            listRun.get(j).setText(record.getBhfs(),0);
                        }else{
                            listRun.get(j).setText("",0);
                        }
                    }else if("#{ysxc}#".equals(listRun.get(j).getText(0))){
                        if(record.getXczk() != null && record.getXczk().equals("原始现场")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{bdxc}#".equals(listRun.get(j).getText(0))){
                        if(record.getXczk() != null && record.getXczk().equals("变动现场")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{yy1}#".equals(listRun.get(j).getText(0))){
                        if(record.getBdyy() != null && record.getBdyy().equals("事主进入")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{yy2}#".equals(listRun.get(j).getText(0))){
                        if(record.getBdyy() != null && record.getBdyy().equals("报案人进入")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{yy3}#".equals(listRun.get(j).getText(0))){
                        if(record.getBdyy() != null && !record.getBdyy().equals("报案人进入") && !record.getBdyy().equals("事主进入")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{yyOther}#".equals(listRun.get(j).getText(0))){
                        if(record.getBdyy() != null && !record.getBdyy().equals("报案人进入") && !record.getBdyy().equals("事主进入")){
                            listRun.get(j).setText(record.getBdyy(),0);
                        }else{
                            listRun.get(j).setText("",0);
                        }
                    }else if("#{tq1}#".equals(listRun.get(j).getText(0))){
                        if(record.getXctq() != null && record.getXctq().equals("阴")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{tq2}#".equals(listRun.get(j).getText(0))){
                        if(record.getXctq() != null && record.getXctq().equals("晴")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{tq3}#".equals(listRun.get(j).getText(0))){
                        if(record.getXctq() != null && record.getXctq().equals("雨")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{tq4}#".equals(listRun.get(j).getText(0))){
                        if(record.getXctq() != null && record.getXctq().equals("雪")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{tq5}#".equals(listRun.get(j).getText(0))){
                        if(record.getXctq() != null && record.getXctq().equals("雾")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{wd}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getXcwd(),0);
                    }else if("#{sd}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getXcsd(),0);
                    }else if("#{fx}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getXcfx(),0);
                    }else if("#{gx1}#".equals(listRun.get(j).getText(0))){
                        if(record.getXcgz() != null && record.getXcgz().contains("自然光")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{gx2}#".equals(listRun.get(j).getText(0))){
                        if(record.getXcgz() != null && record.getXcgz().contains("灯光")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{gx3}#".equals(listRun.get(j).getText(0))){
                        if(record.getXcgz() != null && record.getXcgz().contains("特种光")){
                            listRun.get(j).setText("☑",0);
                        }else{
                            listRun.get(j).setText("□",0);
                        }
                    }else if("#{zhr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getZhrName(),0);
                    }else if("#{zhrUnitName}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getZhrUnitName(),0);
                    }else if("#{zhrZw}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getZhrZw(),0);
                    }else if("#{xcms}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getXcms(),0);
                    }else if("#{blr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getBlrName(),0);
                    }else if("#{ztr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getZtrName(),0);
                    }else if("#{zxr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getZxrName(),0);
                    }else if("#{lxr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getLxrName(),0);
                    }else if("#{lyr}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getLyrName(),0);
                    }else if("#{ztNum}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(ztNum+"",0);
                    }else if("#{picNum}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(picNum+"",0);
                    }else if("#{jzrSex}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getJzrSex(),0);
                    }else if("#{jzrBirth}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getJzrBirth(),0);
                    }else if("#{jzrAddress}#".equals(listRun.get(j).getText(0))){
                        listRun.get(j).setText(record.getJzrAddress(),0);
                    }else if("#{year}#".equals(listRun.get(j).getText(0))){
                        c.setTime( new Date());
                        listRun.get(j).setText(CommonUtils.toChinese(c.get(Calendar.YEAR)%10),0);
                    }else if("#{month}#".equals(listRun.get(j).getText(0))){
                        c.setTime( new Date());
                        listRun.get(j).setText(CommonUtils.toChinese(c.get(Calendar.MONTH)+1),0);
                    }else if("#{day}#".equals(listRun.get(j).getText(0))){
                        c.setTime( new Date());
                        listRun.get(j).setText(CommonUtils.toChinese(c.get(Calendar.DAY_OF_MONTH)),0);
                    }
                }
            }
            /**取得文本的所有表格*/
            Iterator<XWPFTable> it = document.getTablesIterator();
            while(it.hasNext()){/**循环操作表格*/
                XWPFTable table = it.next();
                List<XWPFTableRow> rows = table.getRows();
                SysUploadFile fileInfo = new SysUploadFile();
                String hintText = "";
                for(XWPFTableRow row:rows){/**取得表格的行*/
                    List<XWPFTableCell> cells = row.getTableCells();
                    for(XWPFTableCell cell:cells){/**取得单元格*/
                        boolean addPicFlag = false;
                        boolean replaceFlag = false;
                        if("#{pic1}#".equals(cell.getText())) {/**判断单元格的内容是否为需要替换的图片内容*/
                            if(ztList.size() > 0){
                                fileInfo = ztList.get(0);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint1}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            replaceFlag = true;
                        }else if("#{pic2}#".equals(cell.getText())) {
                            if(picList.size() > 0){
                                fileInfo = picList.get(0);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint2}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 0){
                                fileInfo = picList.get(0);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }else if("#{pic3}#".equals(cell.getText())) {
                            if(picList.size() > 1){
                                fileInfo = picList.get(1);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint3}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 1){
                                fileInfo = picList.get(1);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }else if("#{pic4}#".equals(cell.getText())) {
                            if(picList.size() > 2){
                                fileInfo = picList.get(2);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint4}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 2){
                                fileInfo = picList.get(2);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }else if("#{pic5}#".equals(cell.getText())) {
                            if(picList.size() > 3){
                                fileInfo = picList.get(3);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint5}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 3){
                                fileInfo = picList.get(3);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }else if("#{pic6}#".equals(cell.getText())) {
                            if(picList.size() > 4){
                                fileInfo = picList.get(4);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint6}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 4){
                                fileInfo = picList.get(4);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }else if("#{pic7}#".equals(cell.getText())) {
                            if(picList.size() > 5){
                                fileInfo = picList.get(5);
                                addPicFlag = true;
                            }
                            replaceFlag = true;
                        }else if("#{hint7}#".equals(cell.getText())){/**判断单元格中是否为需要替换的文本内容*/
                            if(picList.size() > 5){
                                fileInfo = picList.get(5);
                                hintText = fileInfo.getFileHint();
                                replaceFlag = true;
                            }

                        }

                        if(replaceFlag && addPicFlag) {
                            //本地测试使用
                            File pic =  new File(filePath+ fileInfo.getFileName());

                            InputStream is =  CommonUtils.getFileFromUrl(fileInfo.getFileUrl());
                            BufferedImage bi = ImageIO.read(is);
                            RectSize size = new RectSize();
                            //FileInputStream fis = (FileInputStream) is;
                            if(fileInfo.getFileType() == 2004){
                                bi = CommonUtils.rotateImage(bi, 90);
                                size = CommonUtils.getFitSize(bi, 800, 600);
                            }else{
                                size = CommonUtils.getFitSize(bi,400,600);
                            }
                            ByteArrayOutputStream os = new ByteArrayOutputStream();
                            ImageIO.write(bi, "png", os);
                            InputStream rsl = new ByteArrayInputStream(os.toByteArray());

                            cell.removeParagraph(0);
                            XWPFParagraph pargraph = cell.addParagraph();
                            pargraph.setAlignment(ParagraphAlignment.CENTER);
                            document.addPictureData(rsl, XWPFDocument.PICTURE_TYPE_PNG);
                            document.createPicture(document.getAllPictures().size() - 1, size.getWidth(), size.getHeight(), pargraph);
                            if (is != null) {
                                is.close();
                            }
                            if(rsl != null) {
                                rsl.close();
                            }
                            if(os != null) {
                                os.close();
                            }
                            List<XWPFParagraph> pars = cell.getParagraphs();
                            for (XWPFParagraph par : pars) {
                                List<XWPFRun> runs = par.getRuns();
                                for (XWPFRun run : runs) {
                                    run.removeBreak();
                                }
                            }
                        }else if(replaceFlag && !addPicFlag){
                            cell.removeParagraph(0);
                            XWPFParagraph paragraph = cell.addParagraph();
                            paragraph.setAlignment(ParagraphAlignment.CENTER);
                            XWPFRun run = paragraph.createRun();
                            run.setFontSize(18);
                            run.setText(hintText);
                        }
                    }
                }
            }
            String downloadPath = filePath + record.getRecordNo()+"_rsl.docx";
            //测试用
            //downloadPath = record.getRecordNo()+"_rsl.docx";
            OutputStream os = new FileOutputStream(downloadPath);
            document.write(os);
            if(os != null){
                os.close();
            }
            if(opc != null){
                opc.close();
            }
            logger.info("finish build word rec_id = "+record.getRecordId());

            //文件上传服务器

            //更新主记录docx下载地址
            PbsRecordWithBLOBs rec = new PbsRecordWithBLOBs();
            rec.setRecordId(record.getRecordId());
            rec.setRecState(1005);
            rec.setDocUrl(Constant.SERVER_URL + "uploadFiles/downloadFile?fileName="+record.getRecordNo()+"_rsl.docx");
            int rsl = pbsRecordMapper.updateWordUrlInfo(rec);
            return  0; //"文件转换成功！路径为："+downloadPath;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0 ;
    }
}
