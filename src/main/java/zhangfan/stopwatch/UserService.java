package zhangfan.stopwatch;

import org.springframework.util.StopWatch;

/**
 * 添加用户
 * 
 * @author zhangfan
 * @date 2018年12月13日上午9:55:39
 * @email 1098730630@qq.com
 */

public class UserService {

	public void addUser() {
		
		StopWatch stopWatch = new StopWatch("用户添加性能监控");

		stopWatch.start("添加用户");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopWatch.stop();

		stopWatch.start("发送短信");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopWatch.stop();

		System.out.println(stopWatch.prettyPrint());
	}
	
	public static void main(String[] args) {
		
		UserService service = new UserService();
		service.addUser();
	}
}
