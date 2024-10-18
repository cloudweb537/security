package com.example.jobs_project.controller;


import com.example.jobs_project.model.JobPost;
import com.example.jobs_project.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {


    @Autowired
    JobService jobService;

    @GetMapping(value = "/jobPosts")
    public List<JobPost> getAllJobPost(){
        return jobService.getAllJobs();
    }


    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);

    }

    @GetMapping("/jobPost/keyword/{keyword}")
    public List<JobPost> getJobByKeyword(@PathVariable("keyword") String keyword){
        return jobService.findByKeyword(keyword);
    }

    @PostMapping("/addJob")
    public void addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }

    @PutMapping("/updateJob")
    public JobPost uppadteJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());

    }


    @DeleteMapping("/deleteJob/{postId}")
    public String deletePost(@PathVariable("postId") int postId){
        jobService.deletePost(postId);
        return "Deleted";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        jobService.deleteAll();
        return "Deleted All recoreds";
    }



}
