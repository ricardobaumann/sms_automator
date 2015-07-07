package com.javapapers.android.androidsmsapp;

import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;
import com.taskadapter.redmineapi.bean.IssueFactory;

import java.util.List;

import static com.taskadapter.redmineapi.bean.IssueFactory.*;

/**
 * Created by ricardo on 07/07/15.
 */
public class RedmineClient {

    public static void createRedmineIssue() throws RedmineException {
        String uri = "https://redmine.zenvia360.com/";
        String apiAccessKey = "rkbTfi9iCNbleUuCTMQ1";
        String projectKey = "compliance";
        Integer queryId = null; // any

        RedmineManager mgr = RedmineManagerFactory.createWithApiKey(uri, apiAccessKey);
        IssueManager issueManager = mgr.getIssueManager();
        List<Issue> issues = issueManager.getIssues(projectKey, queryId);
        for (Issue issue : issues) {
            System.out.println(issue.toString());
        }

        // Create issue
        Issue issueToCreate = createWithSubject("test android");
        Issue createdIssue = issueManager.createIssue(projectKey , issueToCreate);
    }

    public static void main(String[] args) {
        try {
            createRedmineIssue();
        } catch (RedmineException e) {
            e.printStackTrace();
        }
    }
}
