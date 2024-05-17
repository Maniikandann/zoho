package combinedassignment10;

import java.util.LinkedList;
import java.util.Queue;

class Job {
    private String name;
    private int processingTime;
    private int waitingTime;
    private int turnaroundTime;

    public Job(String name, int processingTime) {
        this.name = name;
        this.processingTime = processingTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public String getName() {
        return name;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}

public class JobCPU {
    private Queue<Job> jobQueue;
    private int currentTime;

    public JobCPU() {
        jobQueue = new LinkedList<>();
        currentTime = 0;
    }

    public void addJob(Job job) {
        jobQueue.offer(job);
    }

    public void processJobs() {
        while (!jobQueue.isEmpty()) {
            Job currentJob = jobQueue.poll();
            currentJob.setWaitingTime(currentTime);
            System.out.println("Processing Job: " + currentJob.getName() + ", Processing Time: " + currentJob.getProcessingTime());

     
            try {
                Thread.sleep(currentJob.getProcessingTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentTime += currentJob.getProcessingTime();
            currentJob.setTurnaroundTime(currentTime);
            System.out.println("Job Completed: " + currentJob.getName() + ", Waiting Time: " + currentJob.getWaitingTime() + ", Turnaround Time: " + currentJob.getTurnaroundTime());
        }
    }

    public static void main(String[] args) {
        JobCPU scheduler = new JobCPU();


        scheduler.addJob(new Job("Job1", 3000));
        scheduler.addJob(new Job("Job2", 2000));
        scheduler.addJob(new Job("Job3", 4000));


        scheduler.processJobs();
    }
}

