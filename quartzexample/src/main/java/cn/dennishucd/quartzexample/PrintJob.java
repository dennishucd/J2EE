package cn.dennishucd.quartzexample;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PrintJob implements org.quartz.Job {
	private Logger logger = Logger.getLogger(this.getClass());

	public PrintJob() {
	}

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		logger.info("The log job is executed.");
	}

}
