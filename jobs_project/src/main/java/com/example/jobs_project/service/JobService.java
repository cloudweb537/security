package com.example.jobs_project.service;

import com.example.jobs_project.model.JobPost;
import com.example.jobs_project.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {


    @Autowired
    JobRepo jobRepo;

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public void addAllJobs(JobPost jobPost){
        jobRepo.save(jobPost);
    }


    public JobPost getJob(int jobId) {
        return jobRepo.findById(jobId).orElse(new JobPost());
    }

    public void addJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deletePost(int postId) {
        jobRepo.deleteById(postId);
    }

    public void deleteAll() {
        jobRepo.deleteAll();
    }

    public List<JobPost> findByKeyword(String keyword) {
        return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);

    }

    public static class userService {
    }
}
