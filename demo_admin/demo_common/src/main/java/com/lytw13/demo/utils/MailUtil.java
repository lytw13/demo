package com.lytw13.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.List;

@Component
public class MailUtil {
	private static String from;
	private static String subject;
	private static String text;
	private static JavaMailSender sender;
	private static TemplateEngine templateEngine;

	@Value(value = "${spring.mail.username}")
	private  void setFrom(String from) {
		MailUtil.from = from;
	}
	@Value(value = "${spring.mail.subject}")
	private  void setSubject(String subject) {
		MailUtil.subject = subject;
	}
	@Value(value = "${spring.mail.text}")
	private  void setText(String text) {
		MailUtil.text = text;
	}
	@Autowired
	private void setJavaMailSender(JavaMailSender javaMailSender){
		MailUtil.sender = javaMailSender;
	}
	@Autowired
	private void setTemplateEngine(TemplateEngine templateEngine) {
		MailUtil.templateEngine = templateEngine;
	}
	private static Logger logger = LoggerFactory.getLogger(MailUtil.class);

	public static void sendSimpleMail(String to) {
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom(from);
			simpleMailMessage.setTo(to);
			simpleMailMessage.setSubject(subject);
			simpleMailMessage.setText(text);
			sender.send(simpleMailMessage);
			logger.info("发送邮件成功！");
		}catch(Exception e) {
			logger.error("发送邮件出现错误！",e);
		}
	}
	public static void sendHtmlMail(String to, String content, List<String> attachFileList) {
		try {
			MimeMessage mimeMessage = sender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
			mimeMessageHelper.setFrom(from);
			mimeMessageHelper.setTo(to);
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(content,true);
			if(attachFileList != null && attachFileList.size() > 0) {
				for (String filePath:attachFileList
				) {
					File file = new File(filePath);
					String fileName = filePath.substring(filePath.lastIndexOf("\\")+1);
					mimeMessageHelper.addAttachment(fileName,file);
				}
			}
			sender.send(mimeMessage);
			logger.info("发送邮件成功！");
		} catch (Exception e) {
			logger.error("发送邮件出现错误！",e);
		}
	}

	public static void sendHtmlTemplateMail(String to, String name, List<String> attachFileList) {
		try {
			MimeMessage mimeMessage = sender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
			mimeMessageHelper.setFrom(from);
			mimeMessageHelper.setTo(to);
			mimeMessageHelper.setSubject(subject);
			//存放变量
			Context context = new Context();
			context.setVariable("name", name);
			String template = templateEngine.process("mail_template/mailTemplate", context);
			mimeMessageHelper.setText(template,true);
			if(attachFileList != null && attachFileList.size() > 0) {
				for (String filePath:attachFileList
				) {
					File file = new File(filePath);
					String fileName = filePath.substring(filePath.lastIndexOf("\\")+1);
					mimeMessageHelper.addAttachment(fileName,file);
				}
			}
			sender.send(mimeMessage);
			logger.info("发送邮件成功！");
		} catch (Exception e) {
			logger.error("发送邮件出现错误！",e);
		}
	}
}