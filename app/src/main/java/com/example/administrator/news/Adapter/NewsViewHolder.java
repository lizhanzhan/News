package com.example.administrator.news.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.news.Interface.OnItemClickListener;
import com.example.administrator.news.R;

/**
 * Created by Administrator on 2017/5/18.
 */
public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
         ImageView item_img;
         TextView item_title;
        OnItemClickListener mListener;// 声明自定义的接口
    public NewsViewHolder(View itemView,OnItemClickListener listener) {
        super(itemView);
        mListener = listener;
        // 为ItemView添加点击事件
        itemView.setOnClickListener(this);
        item_img = (ImageView) itemView.findViewById(R.id.item_img);
        item_title = (TextView) itemView.findViewById(R.id.itm_title);
    }

    @Override
    public void onClick(View v) {
        mListener.onItemClick(v,getPosition());
    }
}
