package cn.dennishucd.quartzexample;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.apache.log4j.Logger;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class MainQuartz {
	private static Logger logger = Logger.getLogger(MainQuartz.class);

	/**
	 * 1. Seconds: 0-59 2. Minutes: 0～59 3. Hours: 0～23 4. Day-of-Month: 1-31 5.
	 * Month: 0--11 或者JAN--DEC 6. Day-of-Week： 1-7, 1表示周日， 7. Year (optional
	 * field) 用/表示每，比如0/15每15分钟执行一次 也可以用?表示不特别指定，具体值由其他字段确定,
	 * 具体参见：http://www.quartz
	 * -scheduler.org/documentation/quartz-2.x/tutorials/tutorial-lesson-06.html
	 */
	// 格式：//分 时 日 月 星期 每天凌晨零点整执行一次
	public static final String CRON_RULES = "0 0 0 * * ?";

	public static void main(String[] args) throws Exception {
		// 如果是按天缓存，则启动定时清理任务
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		scheduler.start();

		JobDetail job = newJob(PrintJob.class).withIdentity("job1", "group1")
				.build();

		CronTrigger trigger = newTrigger().withIdentity("trigger1", "group1")
				.withSchedule(cronSchedule(CRON_RULES)).forJob(job).build();

		scheduler.scheduleJob(job, trigger);

		logger.info("The quartz job is started.");
	}
}
