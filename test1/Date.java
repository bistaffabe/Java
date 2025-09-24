//package Account;

public class Date{
    private int month;
    private int day;
    private int year;   

    public Date(int day, int month, int year){

        if (month < 1 || month > 12) {

            throw new IllegalArgumentException("Mês inválido: " + month);
        }
        else{

            this.month = month;
        }

        if((month ==4)||(month==6)||(month==9)||(month==11))
        {
            if ((day>=1) && (day <= 30))
            {
                this.day = day;
            }
            else
            {
                throw new IllegalArgumentException("Dia inválido: " + day + " para o mês " + month);
            }
        }
        if((month ==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
        {
            if ((day>=1)&&(day <= 31))
            {
                this.day = day;
            }
            else
            {
                throw new IllegalArgumentException("Dia inválido: " + day + " para o mês " + month);
            }
        }
        if(month==2)
        {
            if((day>=1)&&(day<=28)){
                this.day= day; 
            }
            else{
                throw new IllegalArgumentException("Dia inválido: " + day + " para o mês " + month);
            }
        }
        this.year = year;
        if (year%4 == 0 && year%100 != 0 || year%400 == 0)
        {
            System.out.printf("O ano %d é bissexto!%n", year);
        }
    }

    public int getMonth() { 
        return month; 
    }

    public int getDay() { 
        return day; 
    }

    public int getYear() {
         return year; 
        }

    @Override
    public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
        };
}

