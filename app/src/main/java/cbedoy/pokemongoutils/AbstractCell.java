package cbedoy.pokemongoutils;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by bedoy on 8/1/16.
 */
public abstract class AbstractCell<T, Holder> extends BaseAdapter {

    protected List<T> dataModel;

    public AbstractCell(List<T> dataModel)
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
        Holder holder = null;

        if (convertView == null)
        {
            convertView = inflateViewAndInjectHolder(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }

        reloadHolder(holder, dataModel.get(position));

        return convertView;
    }

    protected abstract View inflateViewAndInjectHolder(Holder holder);

    protected abstract void reloadHolder(Holder holder, T data);
}
