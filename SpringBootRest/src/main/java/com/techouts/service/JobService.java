package com.techouts.service;


import com.techouts.model.JobPost;
import com.techouts.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public JobPost addJob(JobPost jobPost) {
        repo.save(jobPost);
        return repo.findById(jobPost.getPostId()).orElse(null);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }


    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(null);
    }

    public JobPost updateJob(JobPost jobPost) {
        return repo.save(jobPost);
    }

    public String deleteJob(int id) {
         repo.deleteById(id);
         return "Deleted";
    }
}
