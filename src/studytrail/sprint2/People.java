package studytrail.sprint2;

import java.util.Objects;

public class People {
    private String name;
    private String cpf;

    public People(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + this.name + "\nCPF: " + this.cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        People people = (People) o;
        return this.name.equals(people.name) && this.cpf.equals(people.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf);
    }
}
