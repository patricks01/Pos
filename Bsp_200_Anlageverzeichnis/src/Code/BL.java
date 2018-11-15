
package Code;

/**
 *
 * @author Patrick
 */
public class BL {

    private String bezeichnung;
    private float ak, inbetriebnahme, nd, bishnd,
            afabisher, wertvor, afadj, bw31;

    public BL(String bezeichnung, float ak, float inbetriebnahme, float nd, float bishnd, float afabisher, float wertvor, float afadj, float bw31) {
        this.bezeichnung = bezeichnung;
        this.ak = ak;
        this.inbetriebnahme = inbetriebnahme;
        this.nd = nd;
        this.bishnd = bishnd;
        this.afabisher = afabisher;
        this.wertvor = wertvor;
        this.afadj = afadj;
        this.bw31 = bw31;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public float getAk() {
        return ak;
    }

    public void setAk(float ak) {
        this.ak = ak;
    }

    public float getInbetriebnahme() {
        return inbetriebnahme;
    }

    public void setInbetriebnahme(float inbetriebnahme) {
        this.inbetriebnahme = inbetriebnahme;
    }

    public float getNd() {
        return nd;
    }

    public void setNd(float nd) {
        this.nd = nd;
    }

    public float getBishnd() {
        return bishnd;
    }

    public void setBishnd(float bishnd) {
        this.bishnd = bishnd;
    }

    public float getAfabisher() {
        return afabisher;
    }

    public void setAfabisher(float afabisher) {
        this.afabisher = afabisher;
    }

    public float getWertvor() {
        return wertvor;
    }

    public void setWertvor(float wertvor) {
        this.wertvor = wertvor;
    }

    public float getAfadj() {
        return afadj;
    }

    public void setAfadj(float afadj) {
        this.afadj = afadj;
    }

    public float getBw31() {
        return bw31;
    }

    public void setBw31(float bw31) {
        this.bw31 = bw31;
    }

    public static void main(String[] args) {
      
    }

}
