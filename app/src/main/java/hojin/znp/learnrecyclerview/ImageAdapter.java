package hojin.znp.learnrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.lang.Object;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {
    private LayoutInflater inflater = null;
    Context context;
    Integer[] imageDataList;

    public ImageAdapter(Context c, Integer[] imageDataList) {
        //inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = c;
        this.imageDataList = imageDataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrender, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //getView(position, this, holder);
        holder.name.setBackgroundResource(imageDataList[position]);
        //holder.itemView.
    }

    @Override
    public int getItemCount() {
        return imageDataList.length;
        //return getCount();
        //return Integer.MAX_VALUE;
        //return 24;
    }

    public int getCount() {
        if (imageDataList != null) {
            return Integer.MAX_VALUE;
        } else {
            return 0;
        }
    }

    public Object getItem(int position) {
        if (position >= imageDataList.length) {
            position = position % imageDataList.length;
        }

        return position;
    }

    public long getItemId(int position) {
        if (position >= imageDataList.length) {
            position = position % imageDataList.length;
        }
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.itemrender, parent, false);
        }

        if (position >= imageDataList.length) {
            position = position % imageDataList.length;
        }

        ((ImageView) view).setImageResource(imageDataList[position]);
        return view;
    }

    public int checkPosition(int position) {
        if (position >= imageDataList.length) {
            position = position % imageDataList.length;
        }

        return position;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView name;// init the item view's

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            name = (ImageView) itemView.findViewById(R.id.imageItem);

        }
    }
}