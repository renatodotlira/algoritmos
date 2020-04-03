package challenger;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class Vacation {

    public static void main(String[]args){
        System.out.println(qtdSemanas(2019, "", "", "Tuesday"));
    }

    public static String qtdSemanas(int ano, String mes1, String mes2, String diaSemana){
        List<Mes> meses = new ArrayList<>();
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayWeekIndex = indexOfArray(week, diaSemana);
        int qtdWeeks = 0;
        meses.add(new Mes(31, "January"));
        if(isLeapYear(ano)) {
            meses.add(new Mes(29, "February"));
            System.out.println("bissesto");
        }else {
            meses.add(new Mes(28, "February"));
            System.out.println("não bissesto");
        }
        meses.add(new Mes(31, "March"));
        meses.add(new Mes(30, "April"));
        meses.add(new Mes(31, "May"));
        meses.add(new Mes(30, "June"));
        meses.add(new Mes(31, "July"));
        meses.add(new Mes(31, "August"));
        meses.add(new Mes(30, "September"));
        meses.add(new Mes(31, "October"));
        meses.add(new Mes(30, "November"));
        meses.add(new Mes(31, "December"));


        for (Mes mes : meses) {
            for(int x = 0; x < mes.qtd; x++){
                if(mes.nome.equals("January") && x == 24){
                    return week[dayWeekIndex];
                }
                if(dayWeekIndex<6)
                    dayWeekIndex++;
                else
                    dayWeekIndex = 0;
            }
        }
        return "";
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int indexOfArray(String[] list, String e){
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(e)) {
                return i;
            }
        }
        return 0;
    }

    static class Mes{
        int qtd;
        String nome;
        Mes(int qtd, String nome){
            this.qtd = qtd;
            this.nome = nome;
        }
        public void setQtd(int qtd){
            this.qtd = qtd;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getQtd(){
            return qtd;
        }
        public String getNome(){
            return nome;
        }
        public String toString(){
            return this.nome;
        }
    }
}
