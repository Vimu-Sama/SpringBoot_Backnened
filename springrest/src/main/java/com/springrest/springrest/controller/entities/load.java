package com.springrest.springrest.controller.entities;

public class load {
	private String loadingPoint;
	private long loadid;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	private Integer weight;
	private String comment;
	private long ShipperId;
	private String date;
	public load(String loadingPoint, long loadid, long ShipperId,String unloadingPoint, String productType, String truckType, Integer noOfTrucks,
			Integer weight, String comment, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.loadid = loadid;
		this.ShipperId= ShipperId;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}
	public load() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}
	public long getloadid()
	{
		return loadid;
	}
	public long getShipperId()
	{
		return ShipperId;
	}
	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setloadid(long loadid) {
		this.loadid= loadid;
	}
	public void setShipperId(long shipid)
	{
		this.ShipperId= shipid;
	}
	@Override
	public String toString() {
		return "load [loadid=" + loadid + ",ShipperId= "+ ShipperId + " , loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + comment + ", date=" + date + "]";
	}
	
}
