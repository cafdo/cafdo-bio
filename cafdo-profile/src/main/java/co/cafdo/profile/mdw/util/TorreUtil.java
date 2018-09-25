package co.cafdo.profile.mdw.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import co.cafdo.profile.mdw.model.Job;
import co.cafdo.profile.web.Application;

public class TorreUtil {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public String connectService(String endPoint) {
		String response="";
		RestTemplate restTemplate = new RestTemplate();
		Job job = restTemplate.getForObject(endPoint, Job.class);
		log.info(job.toString());
		return response;
	}
}
