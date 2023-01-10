package my_package_name.homework_7;


public class PersonAbroad extends Person implements DataUsable {

    boolean isRoamingPaid;


    public PersonAbroad(String name, String surname, String city, String phoneNumber, boolean billStatus) {
        super(name, surname, city, phoneNumber);
        this.isRoamingPaid = billStatus;
    }


    public boolean getIsRoamingPaid() {
        return isRoamingPaid;
    }

    public void setIsRoamingPaid(boolean isRoamingPaid) {
        this.isRoamingPaid = isRoamingPaid;
    }

    @Override
    public String call() {
        if (isRoamingPaid) {
            return super.call();
        } else {
            return "недостатньо коштів на рахунку";
        }
    }

    @Override
    public String call(Person anotherPerson) {
        if (isRoamingPaid) {
            return super.call(anotherPerson);
        } else {
            return "недостатньо коштів на рахунку";
        }
    }

    @Override
    public String useData() {
        if (isRoamingPaid) {
            return "надано доступ до використання інтернету у роумнігу";
        } else {
            return "недостатньо коштів на рахунку для доступу послуги інтернет";
        }
    }
}
