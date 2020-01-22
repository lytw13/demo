package com.lytw13.demo.model;

import java.io.Serializable;

public class PageVo implements Serializable {


    private Integer pageNumber;
    private Integer pageSize;

    public PageVo() {
    }

    public PageVo(Integer pageNumber, Integer pageSize) {
        super();
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    /**
     * @return the pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return the pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageVo [pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
    }



}
