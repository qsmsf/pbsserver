package com.easyfly.main.base.entity;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class PageQuery {
	//当前第几页
    private int pageNum=1;

    //总共多少页
    private long pageCount;

    //每页显示几条数据
    private int pageSize = 10;

    //总共多少条
    private long total;

    /* 排序方式 */
    private String orderBy;// 你要排序的字段名称，组成json格式， 1表示升序，-1表示倒序，如：orderBy={cretea_time:-1}

    /* 查询字符串 */
    private String queryStr;

    /* 表单防止重复提交码 */
    private String formToken;

    /* 必须有参数才能做分页查询 */
    private boolean argsCanSearch;

    /* 如果为真,并且pageCount > 0 ,则在数据库中不进行查询 */
    private boolean userPageCount;

    //分页返回的数据
    private Object result;
    //待办数据统计数
    private long notCount = 0;
    
    public boolean isUserPageCount() {
        return userPageCount;
    }

    public void setUserPageCount(boolean userPageCount) {
        this.userPageCount = userPageCount;
    }

    public boolean isArgsCanSearch() {
        return argsCanSearch;
    }

    public void setArgsCanSearch(boolean argsCanSearch) {
        this.argsCanSearch = argsCanSearch;
    }

    public String getFormToken() {
        return formToken;
    }

    public void setFormToken(String formToken) {
        this.formToken = formToken;
    }

    public void init(long total) {
        this.setTotal(total);
        boolean flag = (total%this.getPageSize() == 0) ? false : true;
        long iPageSize = flag ? (total/this.getPageSize()+1) : (total/this.getPageSize());
        if(this.getPageNum() > iPageSize) {
            this.setPageNum(1);
        }
        this.setPageCount(iPageSize);
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPerPage(int pageSize) {
        if(pageSize > 100) {
            this.pageSize = 100;
        } else {
            this.pageSize = pageSize;
        }
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getQueryStr() {
        return queryStr;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public long getNotCount() {
		return notCount;
	}

	public void setNotCount(long notCount) {
		this.notCount = notCount;
	}

	public String getEncodeQueryStr() {
        if(queryStr != null && !"".equals(queryStr)) {
            try {
                return URLEncoder.encode(queryStr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public String getDecodeQueryStr() {
        if(queryStr != null && !"".equals(queryStr)) {
            try {
                return URLDecoder.decode(queryStr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public void setQueryStr(String queryStr) {
        this.queryStr = queryStr;
    }

    public String getCacheString() {
        StringBuffer cacheKey = new StringBuffer();
        cacheKey.append(this.getPageNum()).append("#");
        cacheKey.append(this.getPageSize()).append("#");
        if(StringUtils.isNotEmpty(this.getOrderBy())) {
            cacheKey.append(this.getOrderBy()).append("#");
        }
        List<String> args = new ArrayList<String>();
        setCacheList(args);
        if(args != null && !args.isEmpty()) {
            for(String arg : args) {
                if(StringUtils.isNotEmpty(arg)) {
                    cacheKey.append(arg).append("#");
                }
            }
        }
        return cacheKey.toString();
    }

    /**
     * 设置缓存KEY
     * @param cacheKeys
     */
    public void setCacheList(List<String> args) {

    }
}
