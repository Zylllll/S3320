package cn.happy.day0100;

public class Level {
	private int levelNo; //�ؿ�
	private int strLength; // ͶӰ�ϳ��ֶ��ٸ��ַ�
	private int strTime; // �ַ��ظ����ٴ�
	private int perScore; // ÿ�β����ĵ÷�
	private int timeLimit; // ͨ���ùص�ʱ��
	
	
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