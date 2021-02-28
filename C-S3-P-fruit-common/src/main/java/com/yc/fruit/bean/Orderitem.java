package com.yc.fruit.bean;

public class Orderitem implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer itemid;

    private Double subtotal;

    private Integer count;

    private Integer fid;

    private Integer oid;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}