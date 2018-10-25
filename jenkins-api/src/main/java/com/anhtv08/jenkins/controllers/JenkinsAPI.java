package com.anhtv08.jenkins.controllers;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.QueueReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class JenkinsAPI {

    @Autowired
    private  JenkinsServer jenkinsServer;
     private  static String scrum_token = "3bb1282a3691fd58300ddf5f681b0029";

   /* @RequestMapping( value = "/startJob/${jobName}", method = RequestMethod.GET)
    public String startJenkinJob(@PathVariable("jobName") String jobName) throws IOException, InterruptedException {

        QueueReference queueReference =  jenkinsServer.getJob(jobName).build();
        queueReference.wait(1000);

        return  queueReference.getQueueItemUrlPart();

    }*/

    @RequestMapping( value = "/getJobs", method = RequestMethod.GET)
    public Map<String, Job> getAllJobs() throws IOException {
        return jenkinsServer.getJobs();

    }

    @RequestMapping( value = "/buildJob/{jobName}", method = RequestMethod.GET)
    public String startJob(@PathVariable("jobName") String  jobName) throws IOException {
//        Map<String, String> param = new LinkedHashMap<>();
//        param.put("crumb",scrum_token);
        QueueReference queueReference= jenkinsServer
                .getJob(jobName)
                .build();
//                .build(scrum_token);
        return queueReference.getQueueItemUrlPart();
    }

}
