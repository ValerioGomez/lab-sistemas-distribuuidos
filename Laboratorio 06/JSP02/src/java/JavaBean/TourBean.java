package JavaBean;

import java.io.Serializable;

/**
 * @author PROBOOK
 */
public class TourBean implements Serializable {
    private String make = "Amantani";

    public TourBean() {
        // Constructor por defecto
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
