package Driver;

import java.util.Objects;

public abstract class Driver {
    private String FIO;
    private boolean driverLicense;
    private int experience;

    public Driver(String FIO,
                  boolean driverLicense,
                  int experience) {
        this.FIO = FIO;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFIO() {
        return FIO;
    }

    public abstract void startMove();

    public abstract void stay();

    public abstract void refuelCar();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience
                == driver.experience && Objects.equals(FIO, driver.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "ФИО : " + FIO + ", " + "наличие водительских прав - " + driverLicense + ", "
                + "стаж - " + experience + " лет/год(ов)";
    }
}
