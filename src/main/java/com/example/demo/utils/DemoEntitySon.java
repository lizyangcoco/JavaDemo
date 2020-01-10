package com.example.demo.utils;

/**
 * 类描述：公共demo模板实体类
 *
 * @author 李泽阳 on 2019/12/27 15:28
 */
public class DemoEntitySon {

    private String createDate;
    private String createBy;
    private String updateBy;
    private String updateDate;
    private String deName;
    private String deAge;
    private String deSex;


    public DemoEntitySon() {
        super();
    }

    public DemoEntitySon(String id, String deName, String deAge, String deSex, String createDate, String createBy, String updateBy, String updateDate) {
        Id = id;
        this.deName = deName;
        this.deAge = deAge;
        this.deSex = deSex;
        this.createDate = createDate;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "Id='" + Id + '\'' +
                ", deName='" + deName + '\'' +
                ", deAge='" + deAge + '\'' +
                ", deSex='" + deSex + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName;
    }

    public String getDeAge() {
        return deAge;
    }

    public void setDeAge(String deAge) {
        this.deAge = deAge;
    }

    public String getDeSex() {
        return deSex;
    }

    public void setDeSex(String deSex) {
        this.deSex = deSex;
    }

}
