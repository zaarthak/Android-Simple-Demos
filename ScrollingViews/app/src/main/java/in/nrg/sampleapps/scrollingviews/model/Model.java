package in.nrg.sampleapps.scrollingviews.model;


/**
 * @author Nayanesh Gupte
 */
public class Model {

    public static final int TEXT_TYPE = 0;
    public static final int IMAGE_TYPE = 1;
    public static final int AUDIO_TYPE = 2;

    private int type;
    private int data;
    private String text;

    public Model() {
    }

    public Model(int type, String text, int data) {
        this.type = type;
        this.data = data;
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
