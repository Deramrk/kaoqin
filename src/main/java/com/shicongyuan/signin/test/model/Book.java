package com.shicongyuan.signin.test.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LXG
 * @since 2020-03-14
 */
@TableName("t_book")
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    /**
     * 标识列
     */
    @TableId(value = "bid", type = IdType.AUTO)
    private Integer bid;
    /**
     * 书本名称
     */
    private String bname;
    /**
     * 书本价格
     */
    private Float bprice;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Float getBprice() {
        return bprice;
    }

    public void setBprice(Float bprice) {
        this.bprice = bprice;
    }

    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

    @Override
    public String toString() {
        return "Book{" +
        ", bid=" + bid +
        ", bname=" + bname +
        ", bprice=" + bprice +
        "}";
    }
}
