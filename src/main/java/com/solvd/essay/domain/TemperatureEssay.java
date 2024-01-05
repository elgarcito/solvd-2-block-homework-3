package com.solvd.essay.domain;

public class TemperatureEssay {

    private Long id;
    private double frontMeasurement;
    private boolean essayResult;
    private LabTestReport labTestReport;

    private double leftSideMeasurement;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFrontMeasurement() {
        return frontMeasurement;
    }

    public void setFrontMeasurement(double frontMeasurement) {
        this.frontMeasurement = frontMeasurement;
    }

    public double getLeftSideMeasurement() {
        return leftSideMeasurement;
    }

    public void setLeftSideMeasurement(double leftSideMeasurement) {
        this.leftSideMeasurement = leftSideMeasurement;
    }


    public LabTestReport getLabTestReport() {
        return labTestReport;
    }

    public void setLabTestReport(LabTestReport labTestReport) {
        this.labTestReport = labTestReport;
    }

    public boolean getEssayResult(){
        return essayResult;
    }

    public void setEssayResult(boolean essayResult) {
        this.essayResult = essayResult;
    }


    @Override
    public String toString() {
        String labTestReportValue=null;

        if (labTestReport==null){
            labTestReportValue="null";
        }else {
            labTestReportValue= labTestReport.toString();
        }

        return "TemperatureEssay{" +
                "id=" + id +
                ", frontMeasurement=" + frontMeasurement +
                ", essayResult=" + essayResult +
                ", labTestReport=" + labTestReportValue +
                ", leftSideMeasurement=" + leftSideMeasurement +
                '}';
    }
}
