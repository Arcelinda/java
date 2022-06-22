package payroll;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
   //atributos
    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String role;

    //Construtor sem parametro

    Employee (){

    }
    //Construtor com parametro
    Employee (String name, String role){
        thos.name = name;
        this.role = role;

    }
    //Metodos get and set
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getRole(){
        return this.role;
    }
    public void setId(long id){
        this.role = role;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role){
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName()) && Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getRole());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
