package studytrail.sprint2;

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
}
