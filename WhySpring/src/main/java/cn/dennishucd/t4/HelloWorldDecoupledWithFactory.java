package cn.dennishucd.t4;

import cn.dennishucd.t3.MessageProvider;
import cn.dennishucd.t3.MessageRenderer;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance()
				.getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance()
				.getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
