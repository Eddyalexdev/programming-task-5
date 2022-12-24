public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setEdad(21);
        c1.setNombre("Juan");
        c1.setTelefono(29991299);
        c1.setCredito(100f);

        System.out.println("\n Cliente:");
        System.out.println(" edad :" + c1.getEdad() + "\n nombre: " + c1.getNombre() + "\n telefono: " + c1.getTelefono() + "\n credito: " + c1.getCredito());

        Trabajador t1 = new Trabajador();

        t1.setEdad(34);
        t1.setNombre("Alberto");
        t1.setTelefono(1129102910);
        t1.setSalario(1200f);

        System.out.println("\n Trabajador:");
        System.out.println(" edad :" + t1.getEdad() + "\n nombre: " + t1.getNombre() + "\n telefono: " + t1.getTelefono() + "\n salario: " + t1.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}