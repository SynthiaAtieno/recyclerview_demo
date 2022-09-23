package com.example.snackbar;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SnackbarAdapter extends RecyclerView.Adapter<SnackbarAdapter.ViewHolder> {
//Create an arraylist that will hold a list of contacts
    private ArrayList<Contacts> contacts = new ArrayList<>();

    private Context context;
    public SnackbarAdapter(Context context) {
        this.context = context;

    }

    public void setContacts(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
        //notify after the data has changed
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itme_main, parent,false);
        //creating an instance of viewholder class because the class returns a ViewHolder
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.contactName.setText(contacts.get(position).getName());
        holder.email.setText(contacts.get(position).getEmail());
        //holder.image.setText(contacts.get(position).getImageurl());
        Glide.with(context)
                        .asBitmap()
                                .load(contacts.get(position).getImageurl())
                                        .into(holder.cimage);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,contacts.get(position).getName()+" is clicked",Snackbar.LENGTH_INDEFINITE)
                        .setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(context, contacts.get(position).getName()+" Closed", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setActionTextColor(Color.RED)
                        .setTextColor(Color.GREEN).show();
               // Toast.makeText(context, contacts.get(position).getName()+" is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        //return the sie of the list in our case a list of contacts
        return contacts.size();
    }
//ViewHolder class that will contain all the views
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contactName, email;
        CircleImageView cimage;
        CardView linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.textName);
            email = itemView.findViewById(R.id.textEmail);
            cimage = itemView.findViewById(R.id.image);
            linearLayout = itemView.findViewById(R.id.main_item);
        }
    }

}
