package cn.happy.day0100;

import java.util.Scanner;

public class Player {
	private int levelNo;//等级
	private int perScore;//积分
	private int elapsedTime;//已用时间
	private long startTime;//开始时间
	
	public Player(){
		
	}
	
	public Player(int levelNo, int perScore, int elapsedTime, int startTime) {
		super();
		this.levelNo = levelNo;
		this.perScore = perScore;
		this.elapsedTime = elapsedTime;
		this.startTime = startTime;
	}
	
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	public void play(){
		Game game = new Game(this);//this代表已经创建了的对象引用player
		//外层循环，循环一次级别进一级
		for (int i = 0; i < LevelParam.levelS.length; i++) {
			levelNo += 1;
			//晋级后，记时清零，积分清零
			startTime = System.currentTimeMillis();
			perScore = 0;
			//内层循环，循环一次完成一次字符串的输出，输入，比较。它的限制参数是输出字符串的次数
			for (int j = 0; j < LevelParam.levelS[levelNo-1].getStrTime(); j++) {
				String outstr = game.printStr();//游戏输出字符串
				System.out.println(outstr);
				Scanner input = new Scanner(System.in);
				String instr = input.next();
				game.printResult(outstr, instr);
			}
		}
	}
}
