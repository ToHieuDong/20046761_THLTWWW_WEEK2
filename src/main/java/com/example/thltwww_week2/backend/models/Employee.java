package com.example.thltwww_week2.backend.models;

import com.example.thltwww_week2.backend.enums.EmployeeStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private long employeeId;
    @Column(name = "full_name", length = 50, nullable = false)
    private String fullname;
    @Column(name = "dob", columnDefinition = "DateTime", nullable = false)

    private LocalDate dob;
    @Column(name = "email", length = 50, nullable = false)

    private String email;
    @Column(name = "address", length = 50, nullable = false)

    private String address;
    @Column(name = "phone", length = 50, nullable = false)

    private String phone;

    @Column(name = "status", columnDefinition = "tinyint(4)", nullable = false)

    private EmployeeStatus status;

    public Employee(long employeeId, String fullname, LocalDate dob, String email, String address, String phone, EmployeeStatus status) {
        this.employeeId = employeeId;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public long getEmpid() {
        return employeeId;
    }

    public void setEmpid(long empid) {
        this.employeeId = empid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + employeeId +
                ", fullname='" + fullname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }


}
