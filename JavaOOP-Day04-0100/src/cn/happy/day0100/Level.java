package cn.happy.day0100;

public class Level {
	private int levelNo; //关卡
	private int strLength; // 投影上出现多少个字符
	private int strTime; // 字符重复多少次
	private int perScore; // 每次操作的得分
	private int timeLimit; // 通过该关的时间
	
	
	public Level(int levelNo, int strLength, int strTime, int perScore, int timeLimit) {
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTime = strTime;
		this.perScore = perScore;
		this.timeLimit = timeLimit;
	}
	
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getStrLength() {
		return strLength;
	}
	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}
	public int getStrTime() {
		return strTime;
	}
	public void setStrTime(int strTime) {
		this.strTime = strTime;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	

}
