package club.banyuan.structure;

import club.banyuan.Tool.Config;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 9:33 上午
 */
public class Provider {
    private int id;
    private String name;
    private String desc;
    private String phone;
    private String contactPerson;

    public Provider( int id, String name, String desc, String phone, String contactPerson) {
        this.id =  id;
        this.name = name;
        this.desc = desc;
        this.phone = phone;
        this.contactPerson = contactPerson;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", phone='" + phone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }
}
