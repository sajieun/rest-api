package Part3.ClassDTO;

import Part3.model.PersonVO2;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO2 po = new PersonVO2("sjieun",22,"010-4444-6666");
        System.out.println(po.toString());
        System.out.println(po);
    }
}
