package models;

import java.util.*;

public class BaseModel {
    private int id;
    private Date createdAt;
    private Date lastModifiedAt;

    public int getId() {
        return this.id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}
