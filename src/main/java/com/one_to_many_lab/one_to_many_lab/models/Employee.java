package com.one_to_many_lab.one_to_many_lab.models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="id")
    private Long id;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name ="employee_number")
    private String employeeNumber;

//    @Column(name ="assignment")
//    private Assignment assignment;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee(){};

    public Employee(String firstName, String lastName, String employeeNumber, Department department){
//        Assignment assignment, Department
//    } department)

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
//        this.assignment = assignment;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

//    public Assignment getAssignment() {
//        return assignment;
//    }
//
//    public void setAssignment(Assignment assignment) {
//        this.assignment = assignment;
//    }
//
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
