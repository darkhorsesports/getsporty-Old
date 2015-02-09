package com.darkhorse.getsporty.web.controller.job;
import java.math.BigInteger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.darkhorse.getsporty.domain.Job;

@RequestMapping("/jobs")
@Controller
@RooWebScaffold(path = "jobs", formBackingObject = Job.class)
public class JobController {
	

	@RequestMapping(method = RequestMethod.GET, value = "/new", produces = "text/html")
	public String createJob(Model uiModel) {
		Job job = new Job();
		uiModel.addAttribute("job", job);
		return "jobs/createJob";

	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = "text/html")
	public String saveEvent(Model uiModel, Job job, HttpServletRequest req) {
		jobSvc.saveJob(job);
		String message = "thanks !!!!";
		uiModel.addAttribute("jobs", jobSvc.findAllJobs());
		 return "jobs/list";
	}
	
    @RequestMapping(value = "edit/{id}", params = "form", produces = "text/html")
    public String updateJob(@PathVariable("id") BigInteger id, Model uiModel) {
    	Job job = jobSvc.findJob(id);
    	if(job == null){
    		job = new Job();
    	}
    	uiModel.addAttribute("job", job);
        return "jobs/createJob";
    }

	
}
