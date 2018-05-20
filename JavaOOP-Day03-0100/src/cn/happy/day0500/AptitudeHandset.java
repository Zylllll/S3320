package cn.happy.day0500;
/**
 * 智能手机
 * @author Administrator
 *
 */
public class AptitudeHandset extends Handset implements Network,PlayWiring,TheakePictures {

	@Override
	public void theake() {
		System.out.println("咔嚓......拍照成功......");
		
	}

	@Override
	public void palyWiring() {
		System.out.println("开始播放《小时代》......");
		
	}

	@Override
	public void netWowd() {
		System.out.println("已经开启移动网络......");
		
	}

	@Override
	public void name() {
		System.out.println("这是一款型号为HTC的I9100手机");
		
	}
}
