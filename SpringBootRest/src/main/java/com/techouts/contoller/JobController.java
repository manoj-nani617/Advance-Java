package com.techouts.contoller;

import com.techouts.model.JobPost;
import com.techouts.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;
    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs() {
        List<JobPost>jobPosts =  service.getAllJobs();
        System.out.println(jobPosts);
        return jobPosts;
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId)
    {
        return service.getJob(postId);
    }
    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody  JobPost jobPost)
    {
        return service.addJob(jobPost);
    }
    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        return service.updateJob(jobPost);
    }
    @DeleteMapping("/jobPost/{id}")
    public String deleteJob(@PathVariable("id") int id) {
        return service.deleteJob(id);
    }
}
