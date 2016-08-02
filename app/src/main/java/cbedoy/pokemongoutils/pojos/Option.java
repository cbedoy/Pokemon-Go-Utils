package cbedoy.pokemongoutils.pojos;

import cbedoy.pokemongoutils.interfaces.IPojo;

/**
 * Pokemon-Go-Utils
 * Created by bedoy on 8/1/16.
 */
public class Option implements IPojo
{
    private String title;
    private String action;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public String getTitle() {
        return title;
    }
}
