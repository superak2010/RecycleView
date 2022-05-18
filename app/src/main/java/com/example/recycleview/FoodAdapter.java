package com.example.recycleview;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{
    List<FoodModel> listFoods;
    public FoodAdapter(List<FoodModel> listFoods){
        this.listFoods = listFoods;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_food,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodModel foodModel = listFoods.get(position);
    }

    @Override
    public int getItemCount() {
        if (listFoods == null || listFoods.size() == 0){
            return 0;
        }
        return listFoods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txtTimeOpen, txtName, txtAddress, txtCatagory,txtDiscount, txtDistance;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            img = itemView.findViewById(R.id.imageViewFood);
            txtTimeOpen = itemView.findViewById(R.id.textViewOpen);
            txtName = itemView.findViewById(R.id.textViewName);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtCatagory = itemView.findViewById(R.id.textViewCategory);
            txtDiscount = itemView.findViewById(R.id.textViewDiscount);
            txtDistance = itemView.findViewById(R.id.textViewDistance);
            Calendar calendar1 = Calendar.getInstance();
            String dt1 = "8:00";
            SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");
            String dt2 = "21:00";
            SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
            try {
                Date date1 = format1.parse(dt1);
                Date date2 = format2.parse(dt2);
                if (calendar1.before(date1)||calendar1.after(date2)){
                    txtTimeOpen.setText("Đóng cửa \n Đặt bàn vào lúc 8:00");
                }else {
                    txtTimeOpen.setText("Đang mở cửa");
                }
            }catch (ParseException e){
                e.printStackTrace();
            }
            txtTimeOpen.setText("Đang mở cửa");
        }
        public void bind(FoodModel foodModel){
            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            txtDiscount.setText(foodModel.getDiscount());

        }
    }
}
