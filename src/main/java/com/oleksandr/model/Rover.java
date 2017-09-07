package com.oleksandr.model;

import java.util.Date;
import java.util.List;

public class Rover {
    private int id;
    private String name;
    private Date landing_date;
    private Date launch_date;
    private String status;
    private int max_sol;
    private Date max_date;
    private int total_photos;
    private List<Camera> cameras;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLanding_date() {
        return landing_date;
    }

    public void setLanding_date(Date landing_date) {
        this.landing_date = landing_date;
    }

    public Date getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(Date launch_date) {
        this.launch_date = launch_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMax_sol() {
        return max_sol;
    }

    public void setMax_sol(int max_sol) {
        this.max_sol = max_sol;
    }

    public Date getMax_date() {
        return max_date;
    }

    public void setMax_date(Date max_date) {
        this.max_date = max_date;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;

        Rover rover = (Rover) o;

        if (id != rover.id) return false;
        if (max_sol != rover.max_sol) return false;
        if (total_photos != rover.total_photos) return false;
        if (name != null ? !name.equals(rover.name) : rover.name != null) return false;
        if (landing_date != null ? !landing_date.equals(rover.landing_date) : rover.landing_date != null) return false;
        if (launch_date != null ? !launch_date.equals(rover.launch_date) : rover.launch_date != null) return false;
        if (status != null ? !status.equals(rover.status) : rover.status != null) return false;
        if (max_date != null ? !max_date.equals(rover.max_date) : rover.max_date != null) return false;
        return cameras != null ? cameras.equals(rover.cameras) : rover.cameras == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (landing_date != null ? landing_date.hashCode() : 0);
        result = 31 * result + (launch_date != null ? launch_date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + max_sol;
        result = 31 * result + (max_date != null ? max_date.hashCode() : 0);
        result = 31 * result + total_photos;
        result = 31 * result + (cameras != null ? cameras.hashCode() : 0);
        return result;
    }
}
