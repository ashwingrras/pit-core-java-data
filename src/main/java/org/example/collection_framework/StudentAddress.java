package org.example.collection_framework;

public class StudentAddress
{
    int id;
    int studentId;
    String plotNo;
    String area;
    String city;
    String state;
    String country;

    /*StudentAddress(int id, int studentId, String plotNo, String area, String city,
                   String state, String country)
    {
        this.id = id;
        this.studentId = studentId;
        this.plotNo = plotNo;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
