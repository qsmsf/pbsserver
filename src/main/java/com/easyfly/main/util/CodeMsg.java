package com.easyfly.main.util;

/**
 * 统一定义接口返回的code值和对应的详细信息
 *
 * @author chencan
 */
public class CodeMsg {
    public static final int C500 = 500;
    public static final String C500_MSG = "操作失败，程序发生异常";
    public static final int C600 = 600;
    public static final String C600_MSG = "请求参数必须是字符串形式";
    public static final int C601 = 601;
    public static final String C601_MSG = "不是有效的JSON数据";
    public static final int C602 = 602;
    public static final String C602_MSG = Constant.TOKEN_NAME + "不能为空";
    public static final int C603 = 603;
    public static final String C603_MSG = "无效的" + Constant.TOKEN_NAME;
    public static final int C604 = 604;
    public static final String C604_MSG = "操作成功";
    public static final int C701 = 701;
    public static final String C701_MSG = "插入勘验记录失败";
    public static final int C702 = 702;
    public static final String C702_MSG = "查询条件为空";
    public static final int C703 = 703;
    public static final String C703_MSG = "上传失败";
    public static final int C704 = 704;
    public static final String C704_MSG = "审核记录出错";
}
