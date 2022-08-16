package com.cognizant.medicare.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.medicare.model.TestResults;

public interface TestResultsDao {
    public void insertTestResultsDetails(TestResults test) throws ParseException;

    public List<TestResults> getTestResultsDetails();

    public void updateTestResults(TestResults test);

    public TestResults getTestResults(long reportId);

    public TestResults getTestDetails();
}
