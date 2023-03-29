package bconstructors;

public class PersonMain {
    public static void main(String[] args) {
        // While a public constructor is generated for us,
        // we can still customize our constructor implementation.
        // This customization is intended to be used for validation
        // and should be kept as simple as possible.

        PersonRecord personRecord = new PersonRecord("DESABI", "Tepeyac");
        System.out.println(personRecord);

        // se llama al constructor con un parametro
        // el dato direccion se define como Unknown
        PersonRecord personRecordB = new PersonRecord("Abi");
        System.out.println(personRecordB);

        // llama al constructor con dos parametros,
        // y como no acepta nulos, marca error
        String name = null;
        String address = null;
        PersonRecord personRecordA = new PersonRecord(name, address);
        System.out.println(personRecordA);
    }
}
