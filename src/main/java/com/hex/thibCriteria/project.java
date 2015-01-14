package com.hex.thibCriteria;

public class project {
	private int id;
	private String title;
	private String type;
	private String snapshotAddr;
	private String sourceLinkAddr;
	private String projectFileAddr;
	private int download;
	private String version;
	private int price;
	private String introduction;
	private String releaseDate;
	private String updateTime;
	private String addTime;

	public project() {
	}

	public project(int id, String title, String type, String snapshotAddr,
			String sourceLinkAddr, String projectFileAddr, int download,
			String version, int price, String introduction, String releaseDate,
			String updateTime, String addTime) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.snapshotAddr = snapshotAddr;
		this.sourceLinkAddr = sourceLinkAddr;
		this.projectFileAddr = projectFileAddr;
		this.download = download;
		this.version = version;
		this.price = price;
		this.introduction = introduction;
		this.releaseDate = releaseDate;
		this.updateTime = updateTime;
		this.addTime = addTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSnapshotAddr() {
		return snapshotAddr;
	}

	public void setSnapshotAddr(String snapshotAddr) {
		this.snapshotAddr = snapshotAddr;
	}

	public String getSourceLinkAddr() {
		return sourceLinkAddr;
	}

	public void setSourceLinkAddr(String sourceLinkAddr) {
		this.sourceLinkAddr = sourceLinkAddr;
	}

	public String getProjectFileAddr() {
		return projectFileAddr;
	}

	public void setProjectFileAddr(String projectFileAddr) {
		this.projectFileAddr = projectFileAddr;
	}

	public int getDownload() {
		return download;
	}

	public void setDownload(int download) {
		this.download = download;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}
