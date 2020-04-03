package OOP;

public class ValueOrReference {

    public static void main(String[] args) {

        Person p = new Person();
        Person g = p;
        changePersonName(g);
        System.out.println(p.getName());

        int i = 1;
        int j = i;
        changePrimaryVar(j);
        System.out.println(j);
        System.out.println(i);
    }

    private static void changePersonName(Person p){
        p.setName("Ciclano");
    }

    private static void changePrimaryVar(int x){
        x = 10;
    }

}
