public class Job
{
    private Integer hourlyPayment;

    private Integer hoursNum;

    private Integer fullSalary;

    Job()
    {
        this(0,0);
    }
    Job(Integer hourlyPayment,Integer hoursNum)
    {
        this.hourlyPayment = hourlyPayment;
        this.hoursNum = hoursNum;
        fullSalaryCalculation();
    }
    public void setHourlyPayment(Integer value)
    {
        this.hourlyPayment = value;
    }

    public Integer getHourlyPayment()
    {
        return hourlyPayment;
    }

    public void setHoursNum(Integer value)
    {
        this.hoursNum = value;
    }

    public Integer getHoursNum()
    {
        return hoursNum;
    }
    public Integer getFullSalary()
    {
        return fullSalary;
    }
    private void fullSalaryCalculation()
    {
        this.fullSalary = hourlyPayment * hoursNum;
    }

    public String toString()
    {
        return "Hourly payment: " + hourlyPayment + " | " + "Number of hours: " + hoursNum + " | " + "fullSalary: " + fullSalary;
    }


}
