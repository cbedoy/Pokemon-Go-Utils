package cbedoy.pokemongoutils.cells;


import android.view.View;
import android.widget.TextView;

import java.util.List;

import cbedoy.pokemongoutils.R;
import cbedoy.pokemongoutils.abstracts.AbstractCell;
import cbedoy.pokemongoutils.holders.OptionHolder;
import cbedoy.pokemongoutils.pojos.Option;

/**
 * Pokemon-Go-Utils
 * Created by bedoy on 8/1/16.
 */
public class OptionCell extends AbstractCell<Option, OptionHolder> {

    public OptionCell(List<Option> dataModel) {
        super(dataModel);
    }

    @Override
    protected View inflateViewAndInjectHolder(OptionHolder optionHolder)
    {
        View view = layoutInflater.inflate(R.layout.menu_cell, null);

        optionHolder = new OptionHolder();

        optionHolder.title = (TextView) view.findViewById(R.id.menu_option_view);

        return view;
    }

    @Override
    protected void reloadHolder(OptionHolder optionHolder, Option data)
    {
        optionHolder.title.setText(data.getTitle());
    }
}