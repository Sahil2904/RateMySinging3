package com.example.ratemysinging3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Horiadapter extends RecyclerView.Adapter<Horiadapter.programVholder> {

    private Context mcTx;
    private List<member> memberList;

    public Horiadapter(Context mcTx, List<member> memberList) {

        this.mcTx = mcTx;
        this.memberList = memberList;
    }


    @NonNull
    @Override
    public programVholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.names,parent,false);
        return new programVholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull programVholder holder, int position) {
        member Member = memberList.get(position);

        holder.name2.setText(Member.getName());
        holder.AGE.setText(Member.getAge());
    }

    @Override
    public int getItemCount() {


        return memberList.size();
    }

    public class programVholder extends RecyclerView.ViewHolder{

        TextView name2;
        TextView AGE;
        public programVholder(View itemView) {
            super(itemView);
            name2 = itemView.findViewById(R.id.name2);
            AGE = itemView.findViewById(R.id.age2);
        }
    }
}
