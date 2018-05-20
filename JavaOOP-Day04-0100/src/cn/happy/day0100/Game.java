package cn.happy.day0100;

import java.util.Currency;
import java.util.Date;
import java.util.Random;

public class Game {
	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	// 输出字符串用于和玩家的输入进行比较
	public String printStr() {
		// 获取当前玩家级别的字符串长度
		int strlength = LevelParam.levelS[player.getLevelNo() - 1].getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < strlength; i++) {
			int rand = random.nextInt(strlength);
			switch (rand) {
			case 0:
				buffer.append("1");
				break;
			case 1:
				buffer.append("1");
				break;
			case 2:
				buffer.append("1");
				break;
			case 3:
				buffer.append("1");
				break;
			case 4:
				buffer.append("1");
				break;
			case 5:
				buffer.append("1");
				break;
			default:
				break;
			}
		}
		String result = buffer.toString();
		return result;
	}

	// 比较结果，输出相应信息
	public void printResult(String out, String in) {
		if (out.equals(in)) {
			Date date = new Date();
			//获取当前时间
			long currentTime = date.getTime();
			long closeTime = LevelParam.levelS[player.getLevelNo() - 1].getTimeLimit();
			if ((currentTime - player.getStartTime()) / 1000 > closeTime) {
				System.out.println("你输入的太慢了，已经超时，退出！");
				System.exit(1);
			} else {
				// 计算当前玩家积分
				// 所有的积分相加
				player.setPerScore(player.getPerScore() + LevelParam.levelS[player.getLevelNo() - 1].getPerScore());
				int score = player.getPerScore();// 获取数组内的开始积分
				int time = (int) (currentTime - player.getStartTime()) / 1000;//获取时间差
				player.setElapsedTime(time); //计算总共用时
				int alltime = player.getElapsedTime();
				int no = player.getLevelNo();
				System.out.println("输入正确，您的级别"+no+",您的积分"+score+",已用时间"+alltime+"");
			}
		}else{
			System.out.println("输入错误 ！！！，退出");
            System.exit(1);
		}
	}
}
