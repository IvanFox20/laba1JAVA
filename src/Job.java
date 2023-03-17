public class Job
{
    private Integer hourlyPayment;

    private Integer hoursNum;

    private String employer;
    private Integer fullSalary;

    Job()
    {
        this(0,0,"n/a");
    }
    Job(Integer hourlyPayment,Integer hoursNum,String employer)
    {
        this.hourlyPayment = hourlyPayment;
        this.hoursNum = hoursNum;
        this.employer = employer;
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
    public void SetEmployer(String value)
    {
        this.employer = value;
    }

    public String getEmployer()
    {
        return employer;
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
        return "Hourly payment: " + hourlyPayment + " | " + "Number of hours: " + hoursNum + " | " + "Employer: " + employer + " | " + "fullSalary: " + fullSalary;
    }


}
