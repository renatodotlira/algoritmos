package date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SomaDias {

    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        Calendar cDataExpiracao = new GregorianCalendar();
        cDataExpiracao.setTime(hoje);
        cDataExpiracao.add(Calendar.DAY_OF_MONTH, 5);
        Date novaData = cDataExpiracao.getTime();
        System.out.println(novaData);

    }

}
