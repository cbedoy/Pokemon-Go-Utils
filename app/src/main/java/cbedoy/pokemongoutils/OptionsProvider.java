package cbedoy.pokemongoutils;

import java.util.ArrayList;
import java.util.List;

import cbedoy.pokemongoutils.pojos.Option;

/**
 * Created by bedoy on 8/1/16.
 */

public class OptionsProvider
{
    private List<Option> optionList;


    public OptionsProvider()
    {
        optionList = new ArrayList<>();

        Option option;

        option = new Option();
        option.setAction("open_cp_calculator");
        option.setTitle("CP calculator");
        optionList.add(option);

        option = new Option();
        option.setAction("open_pokedex");
        option.setTitle("Pokedex");
        optionList.add(option);

        option = new Option();
        option.setAction("credits");
        option.setTitle("Credits");
        optionList.add(option);
    }

    public List<Option> getOptionList() {
        return optionList;
    }
}
