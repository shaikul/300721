package com.example.a300721;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


     List<Model> list;
      Callback callback;

    public Adapter(List<Model> list,Callback callback) {
       this.list=list;
       this.callback = callback;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_view_holder,parent,false);
        return new ViewHolder(view,callback);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private Callback callback;
        TextView textView1, textView2, textView3, textView4;
        public ViewHolder(@NonNull View itemView,Callback callback) {
            super(itemView);
            this.callback = callback;
            textView1 = itemView.findViewById(R.id.tvRv1);
            textView2 = itemView.findViewById(R.id.tvRv2);
            textView3 = itemView.findViewById(R.id.tvRv3);
            textView4 = itemView.findViewById(R.id.tvRv4);


        }

        public void onBind(Model model) {
            textView1.setText(model.getNumber());
            textView2.setText(model.getName());
            textView3.setText(model.getTittle());
            textView4.setText(model.getTime());
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.callback(model);
                }
            });
        }

    }

    public interface Callback{
        void callback(Model model);
    }
}
