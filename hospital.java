Creating a comprehensive hospital management system in Java involves multiple components and modules. Below is a simplified version of such a system, which includes classes for patient registration, appointment scheduling, electronic health records (EHR), billing and invoicing, inventory management, and staff management. 

This example will provide a basic structure and functionality for each module. In a real-world application, you would likely use a database for persistent storage, but for simplicity, this example will use in-memory data structures.

### Hospital Management System in Java

```java
import java.util.*;

class Patient {
    private String id;
    private String name;
    private String contact;

    public Patient(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Contact: " + contact;
    }
}

class Appointment {
    private String patientId;
    private Date date;
    private String doctor;

    public Appointment(String patientId, Date date, String doctor) {
        this.patientId = patientId;
        this.date = date;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Appointment for Patient ID: " + patientId + ", Date: " + date + ", Doctor: " + doctor;
    }
}

class EHR {
    private String patientId;
    private String record;

    public EHR(String patientId, String record) {
        this.patientId = patientId;
        this.record = record;
    }

    @Override
    public String toString() {
        return "EHR for Patient ID: " + patientId + ", Record: " + record;
    }
}

class Billing {
    private String patientId;
    private double amount;

    public Billing(String patientId, double amount) {
        this.patientId = patientId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Billing for Patient ID: " + patientId + ", Amount: $" + amount;
    }
}

class Inventory {
    private String itemName;
    private int quantity;

    public Inventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity;
    }
}

class Staff {
    private String id;
    private String name;
    private String role;

    public Staff(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff ID: " + id + ", Name: " + name + ", Role: " + role;
    }
}

class HospitalManagementSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<EHR> ehrRecords = new ArrayList<>();
    private List<Billing> billings = new ArrayList<>();
    private List<Inventory> inventory = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    public void registerPatient(String id, String name, String contact) {
        patients.add(new Patient(id, name, contact));
        System.out.println("Patient registered: " + name);
    }

    public void scheduleAppointment(String patientId, Date date, String doctor) {
        appointments.add(new Appointment(patientId, date, doctor));
        System.out.println("Appointment scheduled for Patient ID: " + patientId);
    }

    public void addEHR(String patientId, String record) {
        ehrRecords.add(new EHR(patientId, record));
        System.out.println("EHR added for Patient ID: " + patientId);
    }

    public void addBilling(String patientId, double amount) {
        billings.add(new Billing(patientId, amount));
        System.out.println("Billing added for Patient ID: " + patientId);
    }

    public void addInventoryItem(String itemName, int quantity) {
        inventory.add(new Inventory(itemName, quantity));
        System.out.println("Inventory item added: " + itemName);
    }

    public void addStaff(String id, String name, String role) {
        staffMembers.add(new Staff(id, name, role));
        System.out.println("Staff member added: " + name);
    }

    public void displayPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void displayAppointments() {
