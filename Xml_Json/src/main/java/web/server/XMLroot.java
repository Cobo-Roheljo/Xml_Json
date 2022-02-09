package web.server;

import java.util.Vector;

public class XMLroot {

    //variabili
    public int annoDiInizio;
    public aula aula = new aula();
    public String classe;
    public int numeroFinestre;
    public String specializzazione;
    public Vector <element> studenti = new Vector<>();
    

    //get e set anno di inizio
    public int getAnnoDiInizio() {
        return annoDiInizio;
    }
    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    //get e set aula
    public aula getAula() {
        return aula;
    }
    public void setAula(aula aula) {
        this.aula = aula;
    }

    //get e set classe
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    //get e set numero finestre
    public int getNumeroFinestre() {
        return numeroFinestre;
    }
    public void setNumeroFinestre(int numeroFinestreM) {
        this.numeroFinestre = numeroFinestreM;
    }

    //get e set specializzazione
    public String getSpecializzazione() {
        return specializzazione;
    }
    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    //get e set studenti
    public Vector<element> getStudenti() {
        return studenti;
    }
    public void setStudenti(Vector<element> studenti) {
        this.studenti = studenti;
    }
}
