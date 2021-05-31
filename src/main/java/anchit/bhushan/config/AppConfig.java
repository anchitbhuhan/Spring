package anchit.bhushan.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import anchit.bhushan.api.formatter.NameFormatter;
import anchit.bhushan.api.formatter.PhoneNumberFormatter;
import anchit.bhushan.converter.CreditCardConverter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "anchit.bhushan")
@PropertySource("classpath:email.properties")
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;
	
	
	
	
	/*
	 * Setting up View Resolver
	 */
	@Bean
	public InternalResourceViewResolver ViewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}

	/*
	 * Setting up message source (application.properties)
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());

		return localValidatorFactoryBean;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

		System.out.println(env.getProperty("mail.host"));
		
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntPropery("mail.port"));

		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		javaMailSenderImpl.setJavaMailProperties(mailProperties);

		return javaMailSenderImpl;

	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		System.out.println("Inside resource handler");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

	/*
	 * Adding Formatters, Converters to registry
	 */
	@Override
	public void addFormatters(FormatterRegistry registry) {

		System.out.println("Inside Add formatter from Appconfig");
		registry.addFormatter(new PhoneNumberFormatter());
		/*
		 * registry.addFormatter(new CreditCardFormatter()); registry.addFormatter(new
		 * CurrencyFormatter());
		 */
		registry.addConverter(new CreditCardConverter());
		registry.addFormatter(new NameFormatter());

	}
	
	public int getIntPropery(String key)
	{
		String property = env.getProperty(key);
		return Integer.parseInt(property);
	}

}
