package cc.hyperium.installer.api.callbacks;

/*
 * Created by Cubxity on 08/07/2018
 */
public class StatusCallback extends AbstractCallback {

    private Phrase phrase;
    private String message;
    private Object object;

    public StatusCallback(Phrase phrase, String message, Object object) {
        this.phrase = phrase;
        this.message = message;
        this.object = object;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Phrase getPhrase() {
        return phrase;
    }

    public Object getObject() {
        return object;
    }
}
