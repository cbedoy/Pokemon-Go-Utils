package cbedoy.pokemongoutils;

import android.view.View;

import java.util.List;

/**
 * Created by bedoy on 8/1/16.
 */
public class OptionCell<Option, OptionHolder> extends AbstractCell{

    public OptionCell(List dataModel) {
        super(dataModel);
    }

    @Override
    protected View inflateViewAndInjectHolder(OptionHolder holder)
    {
        return null;
    }

    @Override
    protected void reloadHolder(OptionHolder holder, Option data)
    {

    }
}