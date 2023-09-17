package com.example.thltwww_week2.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", nullable = false)
    private long empid;
    @Column(name = "full_name", columnDefinition = "nvachar(150)", nullable = false)
    private String fullname;
    @Column(name = "dob", columnDefinition = "DateTime", nullable = false)

    private LocalDateTime dob;
    @Column(name = "email", columnDefinition = "nvachar(150)", nullable = false)

    private String email;
    @Column(name = "address", columnDefinition = "nvachar(150)", nullable = false)

    private String address;
    @Column(name = "phone", columnDefinition = "nvachar(150)", nullable = false)

    private String phone;

    @Column(name = "status", columnDefinition = "int", nullable = false)

    private int status;

    public employee(long empid, String fullname, LocalDateTime dob, String email, String address, String phone, int status) {
        this.empid = empid;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public employee() {
    }

    @Override
    public String toString() {
        return "employee{" +
                "empid=" + empid +
                ", fullname='" + fullname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }


}
