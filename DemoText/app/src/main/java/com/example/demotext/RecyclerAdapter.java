package com.example.demotext;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 赵瑞波 on 2018/3/5.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Bean.ResultBean.DataBean> list;
    private Context context;

    public RecyclerAdapter(List<Bean.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.imageView = (ImageView) rootView.findViewById(R.id.imageView);
            this.textView = (TextView) rootView.findViewById(R.id.textView);
        }

    }
}
