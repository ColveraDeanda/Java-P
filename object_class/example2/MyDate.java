package oracle_certification_preparation.object_class.example2;

import java.util.Objects;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * En este caso se está sobreescribiendo el método equals(), que está disponible en la clase Object.
     */
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof MyDate) {
            MyDate temp = (MyDate) o;
            result = (temp.day == day) && (temp.month == month) && (temp.year == year);
        }
        return result;
    }

    /**
     * Nota interesante:
     * Cuando se sobreescribe equals, generalmente tambien es necesario sobreescribir hashCode() method.
     * 1. El método hashcode() es otro método definido en java.lang.Object
     * 2. El método hashcode() retorna un integer que identifica al objeto.
     */

    // Ejemplo: Existe una forma simple de usar hashcode con un helper que ofrece las clase Objects.
    // video 105
    public int hashCode(){
//        return Objects.hash(firstname, lastname, married, childrenCount);
        return 0;
    }

}
