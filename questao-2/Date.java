public class Date {
    // declarando os atributos
    private int day;
    private int month;
    private int year;

    // construtor

    public Date(int day, int month, int year){
        // validação do dia
        if (day >= 1 && day <= 31){
            this.day = day;
        }

        // validação do mes
        if (month >= 1 && month <= 12){
            this.month = month;
        }

        // validação de ano
        if (year > 0){
            this.year = year;
        }

    }

     // metodos set
        // geralmente não devolvem valor e apenas alteram o resultado, por isso é usado o void em vez de int
        public void setDay(int day){
            if (day >= 1 && day <= 31){
            this.day = day;
        }
    }

    public void setMonth(int month){
            if (month >= 1 && month <= 12){
            this.month = month;
        }
    }

    public void setYear(int year){
        if (year > 0){
            this.year = year;
        }
    }

    // metodos get
    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getyear(){
        return year;
    }

    public void displayDate() {
    // formatador de data com as barras /
    System.out.printf("%02d/%02d/%02d%n", day, month, year);
}

}
