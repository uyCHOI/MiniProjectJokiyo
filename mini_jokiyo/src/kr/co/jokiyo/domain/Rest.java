package kr.co.jokiyo.domain;

public class Rest {
	private int restId;
	private String name;
	private int typeId;
	private String typeName;
	private int exitNum;
	private String exitName;
	private String tel;
	private String openDate;
	private String closeDate;
	private String addr;
	private float star;
	private int reviewCnt;
	public String getExitName() {
		return exitName;
	}
	public void setExitName(String exitName) {
		this.exitName = exitName;
	}

	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public float getStar() {
		return star;
	}
	public void setStar(float star) {
		this.star = star;
	}
	public int getReviewCnt() {
		return reviewCnt;
	}
	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getExitNum() {
		return exitNum;
	}
	public void setExitNum(int exitNum) {
		this.exitNum = exitNum;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

}
