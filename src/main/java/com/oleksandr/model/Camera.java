package com.oleksandr.model;

public class Camera {
    private int id;
    private String name;
    private int rover_id;
    private String full_name;

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

    public int getRover_id() {
        return rover_id;
    }

    public void setRover_id(int rover_id) {
        this.rover_id = rover_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camera)) return false;

        Camera camera = (Camera) o;

        if (id != camera.id) return false;
        if (rover_id != camera.rover_id) return false;
        if (name != null ? !name.equals(camera.name) : camera.name != null) return false;
        return full_name != null ? full_name.equals(camera.full_name) : camera.full_name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + rover_id;
        result = 31 * result + (full_name != null ? full_name.hashCode() : 0);
        return result;
    }
}
