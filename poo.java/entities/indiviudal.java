package entities;

public class indiviudal  extends taxPlayer{

    private  Double healthExpenditures;

    public indiviudal(String name, Double anualIncome, Double healthExpenditures) {
    }

    public indiviudal(Double anualIncome, String name, Double healthExpenditures) {
        super(anualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public Double tax(){
        if(getAnualIncome()<=20000){
            return (getAnualIncome() *0.15)-(getHealthExpenditures() * 0.5);
        }
        else {
            return (getAnualIncome() *0.25)-(getHealthExpenditures() * 0.5);
        }
    }
}
