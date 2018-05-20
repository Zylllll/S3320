package cn.happy.day0100;

import java.util.Scanner;

public class Player {
	private int levelNo;//�ȼ�
	private int perScore;//����
	private int elapsedTime;//����ʱ��
	private long startTime;//��ʼʱ��
	
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
		Game game = new Game(this);//this�����Ѿ������˵Ķ�������player
		//���ѭ����ѭ��һ�μ����һ��
		for (int i = 0; i < LevelParam.levelS.length; i++) {
			levelNo += 1;
			//�����󣬼�ʱ���㣬��������
			startTime = System.currentTimeMillis();
			perScore = 0;
			//�ڲ�ѭ����ѭ��һ�����һ���ַ�������������룬�Ƚϡ��������Ʋ���������ַ����Ĵ���
			for (int j = 0; j < LevelParam.levelS[levelNo-1].getStrTime(); j++) {
				String outstr = game.printStr();//��Ϸ����ַ���
				System.out.println(outstr);
				Scanner input = new Scanner(System.in);
				String instr = input.next();
				game.printResult(outstr, instr);
			}
		}
	}
}
