package cn.happy.day0300;

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

	// ����ַ������ں���ҵ�������бȽ�
	public String printStr() {
		// ��ȡ��ǰ��Ҽ�����ַ�������
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
		String resul = buffer.toString();
		return resul;
	}

	// �ȽϽ���������Ӧ��Ϣ
	public void printResult(String out, String in) {
		if (out.equals(in)) {
			
			Date date = new Date();
			// ��ȡ��ǰʱ��
			long currenTime = date.getTime();
			//��ȡ��������Ҫͨ�ص�ʱ��
			long closeTime = LevelParam.levelS[player.getLevelNo() - 1].getTimeLimit();
			//�õ�ǰʱ���ȥ��ʼʱ�����1000(����)
			if ((currenTime - player.getStartTime()) / 1000 > closeTime) {
				System.out.println("�������̫���ˣ�ʱ�䵽��");
				System.exit(1);
			}else{
				// ���㵱ǰ��һ���
				//�õ�ǰ�Ļ��ּ����������ʼ�Ļ��ַ��ظ�play��Ļ���
				player.setPerScore(player.getPerScore()+LevelParam.levelS[player.getLevelNo()-1].getPerScore());
				int score = (player.getPerScore());// ���еĻ������
				int time = (int)(currenTime - player.getStartTime())/1000; //��ȡʱ���
				player.setElapsedTime(time);//�����ʱ����ȥ
				int alltime = player.getElapsedTime();//�ܹ���ʱ
				int no = player.getLevelNo();
				System.out.println("������ȷ�����ļ���"+no+",���Ļ���"+score+",����ʱ��"+alltime+"");
			}
		}else{
			System.out.println("�������");
			System.exit(1);
		}
	}

}
