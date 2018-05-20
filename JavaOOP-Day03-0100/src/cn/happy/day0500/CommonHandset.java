package cn.happy.day0500;

public class CommonHandset extends Handset implements PlayWiring {

	@Override
	public void palyWiring() {
		System.out.println("开始播放音乐《热血》......");
		
	}

	@Override
	public void name() {
		System.out.println("这是一款型号为G502c的索尼爱立信手机");
		
	}
}
