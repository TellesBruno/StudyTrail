package studytrail.Sprint3;

import studytrail.sprint2.People;

public class Employer extends People {
    private Integer registrationNumber;

    public Employer(String name, String cpf, Integer registrationNumber) {
        super(name, cpf);
        this.registrationNumber = registrationNumber;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
