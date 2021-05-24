package com.example.newsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Popular {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("num_results")
    @Expose
    private int number_of_Results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber_of_Results() {
        return number_of_Results;
    }

    public void setNumber_of_Results(int number_of_Results) {
        this.number_of_Results = number_of_Results;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @SerializedName("results")
    @Expose
    private List<Results> results;

}
