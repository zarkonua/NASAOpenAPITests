package com.oleksandr.model;

import java.util.Date;

public class Photo {
    private int id;
    private int sol;
    private Camera camera;
    private String img_src;
    private Date earth_date;
    private Rover rover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public Date getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(Date earth_date) {
        this.earth_date = earth_date;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;

        Photo photo = (Photo) o;

        if (id != photo.id) return false;
        if (sol != photo.sol) return false;
        if (!camera.equals(photo.camera)) return false;
        if (!img_src.equals(photo.img_src)) return false;
        if (!earth_date.equals(photo.earth_date)) return false;
        return rover.equals(photo.rover);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sol;
        result = 31 * result + camera.hashCode();
        result = 31 * result + img_src.hashCode();
        result = 31 * result + earth_date.hashCode();
        result = 31 * result + rover.hashCode();
        return result;
    }
}
