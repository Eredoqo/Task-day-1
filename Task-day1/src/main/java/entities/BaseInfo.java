package entities;

import java.util.Date;

public class BaseInfo {

    private long id;
    private Date createdAt;
    private Date modifiedAt;

    public BaseInfo(long id, Date createdAt, Date modifiedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public BaseInfo() {

    }

    public long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
