package com.love;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finace=new FinanceReport();
        Report health=new HealthReport();
        List<Report> reports=new ArrayList<>();
        reports.add(finace);
        reports.add(health);
        for(Report report:reports){
            report.load();
            report.print();
        }
    }
}
