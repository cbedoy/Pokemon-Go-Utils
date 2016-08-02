package cbedoy.pokemongoutils.abstracts;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Pokemon-Go-Utils
 * Created by bed]oy on 8/1/16.
 */
public abstract class AbstractCell<POJO, HOLDER> extends BaseAdapter {

    protected List<POJO> dataModel;
    protected LayoutInflater layoutInflater;

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    public AbstractCell(List<POJO> dataModel)
    {
        this.dataModel = dataModel;
    }

    @Override
    public int getCount() {
        return dataModel.size();
    }

    @Override
    public Object getItem(int position) {
        return dataModel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        HOLDER holder = null;

        if (convertView == null)
        {
            convertView = inflateViewAndInjectHolder(holder);

            convertView.setTag(holder);
        }
        else
        {
            holder = (HOLDER) convertView.getTag();
        }

        reloadHolder(holder, dataModel.get(position));

        return convertView;
    }

    protected abstract View inflateViewAndInjectHolder(HOLDER holder);

    protected abstract void reloadHolder(HOLDER holder, POJO data);
}
