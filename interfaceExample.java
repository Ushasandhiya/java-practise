interface readable {
    void read();
}

interface writable {
    void write();
}

interface storable {
    void store();
}

class file implements readable, writable, storable {
    public void read() {
        System.out.println("Reading file...");
    }

    public void write() {
        System.out.println("Writing to file...");
    }

    public void store() {
        System.out.println("Storing file...");
    }
}
public class interfaceExample{
    public static void main(String[] args) {
        file myFile = new file();
        myFile.read();
        myFile.write();
        myFile.store();
    }
}
