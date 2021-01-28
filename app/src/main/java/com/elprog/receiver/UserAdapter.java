package com.elprog.receiver;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.elprog.receiver.Model.Users;
import com.google.gson.Gson;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    ArrayList<Users> userslist;
    Context context;

    // Constructor for initialization
    public UserAdapter(Context context, ArrayList userslist) {
        this.context = context;
        this.userslist = userslist;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates user_item_row.xml layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item_row, parent, false);

        // Passing view to ViewHolder
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtuname.setText(userslist.get(position).getName());
        holder.username.setText(userslist.get(position).getUsername());
        holder.email.setText(userslist.get(position).getEmail());
        holder.street.setText(userslist.get(position).getAddress().getStreet());
        holder.suite.setText(userslist.get(position).getAddress().getSuite());
        holder.city.setText(userslist.get(position).getAddress().getCity());
        holder.zipcode.setText(userslist.get(position).getAddress().getZipcode());
        holder.lat.setText(userslist.get(position).getAddress().getGeo().getLat());
        holder.lng.setText(userslist.get(position).getAddress().getGeo().getLng());
        holder.phone.setText(userslist.get(position).getPhone());
        holder.website.setText(userslist.get(position).getWebsite());
        holder.cname.setText(userslist.get(position).getCompany().getName());
        holder.catchPhrase.setText(userslist.get(position).getCompany().getCatchPhrase());
        holder.bs.setText(userslist.get(position).getCompany().getBs());



    }

    @Override
    public int getItemCount() {
        // Returns number of items currently available in Adapter
        return userslist.size();
    }


    // Initializing the Views
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView
                txtuname,
                username,
                email,
                street,
                suite,
                city,
                zipcode,
                lat,
                lng,
                phone,
                website,
                cname,
                catchPhrase,
                bs;
        CardView cardview;

        public ViewHolder(View view) {
            super(view);
            txtuname = (TextView) view.findViewById(R.id.txtuname);
            username = (TextView) view.findViewById(R.id.txtusername);
            email = (TextView) view.findViewById(R.id.txtemail);
            street = (TextView) view.findViewById(R.id.txtstreet);
            suite = (TextView) view.findViewById(R.id.txtsuite);
            city = (TextView) view.findViewById(R.id.txtcity);
            zipcode = (TextView) view.findViewById(R.id.txtzipcode);
            lat = (TextView) view.findViewById(R.id.txtlat);
            lng = (TextView) view.findViewById(R.id.txtlng);
            phone = (TextView) view.findViewById(R.id.txtphone);
            website = (TextView) view.findViewById(R.id.txtwebsite);
            cname = (TextView) view.findViewById(R.id.txtcname);
            catchPhrase = (TextView) view.findViewById(R.id.txtcatchPhrase);
            bs = (TextView) view.findViewById(R.id.txtbs);
            cardview=(CardView) view.findViewById(R.id.carditem);
        }
    }

}
