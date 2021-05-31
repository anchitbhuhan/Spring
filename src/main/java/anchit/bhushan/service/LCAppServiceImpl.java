package anchit.bhushan.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:results.properties")
public class LCAppServiceImpl implements LCAppService {

	
	@Autowired
	private Environment env;
	
	@Override
	public String calculateLove(String username, String crushname) {
		
		Random random = new Random();
		int totallength = username.length() + crushname.length();
		
		int modVal = totallength + random.nextInt(100);
		
		String source = env.getProperty("results.source");
		String res = "";
		
		System.out.println("Source is "+source);
		System.out.println("modVal is "+modVal);
		System.out.println("source lengths is "+source.length());
		
		if(modVal % source.length() == 0)
			res =  res + env.getProperty("results.friend");
		else if(modVal % source.length() == 1)
			res = res + env.getProperty("results.love");
		else if(modVal % source.length() == 2)
			res = res+  env.getProperty("results.soulmate");
		else if(modVal % source.length() == 3)
			res =  res + env.getProperty("results.enemy");
		
		System.out.println("in Method is "+res);
		return res;
		
		
	}

}
