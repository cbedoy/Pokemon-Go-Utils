package cbedoy.pokemongoutils.viewcontroller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import cbedoy.pokemongoutils.providers.OptionsProvider;
import cbedoy.pokemongoutils.R;
import cbedoy.pokemongoutils.cells.OptionCell;
import cbedoy.pokemongoutils.pojos.Option;

/**
 * Pokemon-Go-Utils
 * Created by bedoy on 8/1/16.
 */
public class MenuViewController extends Fragment
{

    private OptionsProvider optionsProvider;
    private OptionCell optionCell;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewController = inflater.inflate(R.layout.menu_view_controller, null);

        optionsProvider = new OptionsProvider();
        optionCell = new OptionCell(optionsProvider.getOptionList());
        optionCell.setLayoutInflater(inflater);

        ListView listView = (ListView) viewController.findViewById(R.id.menu_list_view);
        listView.setAdapter(optionCell);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Option option = optionsProvider.getOptionList().get(position);

            }
        });
        return viewController;
    }
}
