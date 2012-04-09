package com.done.model;

/**
 * PayType generated by MyEclipse Persistence Tools
 */

public class PayType implements java.io.Serializable {

	// Fields

	private Integer payId;

	private String name;

	private String content;

	private String memo;

	// Constructors

	/** default constructor */
	public PayType() {
	}

	/** minimal constructor */
	public PayType(Integer payId) {
		this.payId = payId;
	}

	/** full constructor */
	public PayType(Integer payId, String name, String content, String memo) {
		this.payId = payId;
		this.name = name;
		this.content = content;
		this.memo = memo;
	}

	// Property accessors

	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}