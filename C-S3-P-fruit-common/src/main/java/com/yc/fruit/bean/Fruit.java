package com.yc.fruit.bean;

import java.util.Date;

public class Fruit implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer fid;

    private String fname;

    private Double fprice;

    private Double fnprice;

    private String fImage;

    private String fdesc;

    private Integer hot;

    private Date fdate;

    private Integer guanggao;

    private Integer cid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }

    public Double getFnprice() {
        return fnprice;
    }

    public void setFnprice(Double fnprice) {
        this.fnprice = fnprice;
    }

    public String getfImage() {
        return fImage;
    }

    public void setfImage(String fImage) {
        this.fImage = fImage == null ? null : fImage.trim();
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public Integer getGuanggao() {
        return guanggao;
    }

    public void setGuanggao(Integer guanggao) {
        this.guanggao = guanggao;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}