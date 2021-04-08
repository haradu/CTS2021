package ro.ase.acs.composite;

import javax.naming.OperationNotSupportedException;
import java.awt.dnd.InvalidDnDOperationException;

public class Angajat extends MembruOrganizatie {

    private String nume;
    private float salariu;

    @Override
    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaMembru(MembruOrganizatie membru) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeMembru(MembruOrganizatie membru) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MembruOrganizatie cautaMembru(String nume) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String afisareDetalii() {
        return this.nume+ " ";
    }
}
