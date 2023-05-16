package com.example.mynotes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynotes.Models.Notes;
import com.example.mynotes.NotesClickListener;
import com.example.mynotes.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder> {


    Context contex;
    List<Notes> list;

    NotesClickListener listener;

    public NotesListAdapter(Context contex, List<Notes> list, NotesClickListener listener) {
        this.contex = contex;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesViewHolder(LayoutInflater.from(contex).inflate(R.layout.notes_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

        holder.textView_title.setText(list.get(position).getTitle());
        holder.textView_title.setSelected(true);

        holder.textView_notes.setText(list.get(position).getNotes());

        holder.textView_date.setText(list.get(position).getDate());
        holder.textView_date.setSelected(true);

        if (list.get(position).isPinned()) {
            holder.imageView_pin.setImageResource(R.drawable.pin_icon);
        } else {
            holder.imageView_pin.setImageResource(0);
        }
        int color_code = getRandomColor();
        holder.notes_conteiner.setCardBackgroundColor(holder.itemView.getResources().getColor(color_code, null));

        holder.notes_conteiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(list.get(holder.getAdapterPosition()));
            }
        });

        holder.notes_conteiner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onLongClick(list.get(holder.getAdapterPosition()),holder.notes_conteiner);
                return true;
            }
        });
    }

    private int getRandomColor() {
        ;
        List<Integer> colorCode = new ArrayList<>();
        colorCode.add(R.color.Ivory);
        colorCode.add(R.color.LightYellow);
        colorCode.add(R.color.Yellow);
        colorCode.add(R.color.Snow);
        colorCode.add(R.color.FloralWhite);
        colorCode.add(R.color.LemonChiffon);
        colorCode.add(R.color.Cornsilk);
        colorCode.add(R.color.Seashell);
        colorCode.add(R.color.LavenderBlush);
        colorCode.add(R.color.PapayaWhip);
        colorCode.add(R.color.BlanchedAlmond);
        colorCode.add(R.color.MistyRose);
        colorCode.add(R.color.Bisque);
        colorCode.add(R.color.Moccasin);
        colorCode.add(R.color.NavajoWhite);
        colorCode.add(R.color.PeachPuff);
        colorCode.add(R.color.Gold);
        colorCode.add(R.color.Pink);
        colorCode.add(R.color.LightPink);
        colorCode.add(R.color.Orange);
        colorCode.add(R.color.LightSalmon);
        colorCode.add(R.color.DarkOrange);
        colorCode.add(R.color.Coral);
        colorCode.add(R.color.HotPink);
        colorCode.add(R.color.Tomato);
        colorCode.add(R.color.OrangeRed);
        colorCode.add(R.color.DeepPink);
        colorCode.add(R.color.Fuchsia);
        colorCode.add(R.color.Magenta);
        colorCode.add(R.color.Red);
        colorCode.add(R.color.OldLace);
        colorCode.add(R.color.LightGoldenrodYellow);
        colorCode.add(R.color.Linen);
        colorCode.add(R.color.AntiqueWhite);
        colorCode.add(R.color.Salmon);
        colorCode.add(R.color.GhostWhite);
        colorCode.add(R.color.MintCream);
        colorCode.add(R.color.WhiteSmoke);
        colorCode.add(R.color.Beige);
        colorCode.add(R.color.Wheat);
        colorCode.add(R.color.SandyBrown);
        colorCode.add(R.color.Azure);
        colorCode.add(R.color.Honeydew);
        colorCode.add(R.color.AliceBlue);
        colorCode.add(R.color.Khaki);
        colorCode.add(R.color.LightCoral);
        colorCode.add(R.color.PaleGoldenrod);
        colorCode.add(R.color.Violet);
        colorCode.add(R.color.DarkSalmon);
        colorCode.add(R.color.Lavender);
        colorCode.add(R.color.LightCyan);
        colorCode.add(R.color.BurlyWood);
        colorCode.add(R.color.Plum);
        colorCode.add(R.color.Gainsboro);
        colorCode.add(R.color.Crimson);
        colorCode.add(R.color.PaleVioletRed);
        colorCode.add(R.color.Goldenrod);
        colorCode.add(R.color.Orchid);
        colorCode.add(R.color.Thistle);
        colorCode.add(R.color.LightGrey);
        colorCode.add(R.color.Tan);
        colorCode.add(R.color.Chocolate);
        colorCode.add(R.color.Peru);
        colorCode.add(R.color.IndianRed);
        colorCode.add(R.color.MediumVioletRed);
        colorCode.add(R.color.Silver);
        colorCode.add(R.color.DarkKhaki);
        colorCode.add(R.color.RosyBrown);
        colorCode.add(R.color.MediumOrchid);
        colorCode.add(R.color.DarkGoldenrod);
        colorCode.add(R.color.FireBrick);
        colorCode.add(R.color.PowderBlue);
        colorCode.add(R.color.LightSteelBlue);
        colorCode.add(R.color.PaleTurquoise);
        colorCode.add(R.color.GreenYellow);
        colorCode.add(R.color.LightBlue);
        colorCode.add(R.color.DarkGray);
        colorCode.add(R.color.Brown);
        colorCode.add(R.color.Sienna);
        colorCode.add(R.color.YellowGreen);
        colorCode.add(R.color.DarkOrchid);
        colorCode.add(R.color.PaleGreen);
        colorCode.add(R.color.DarkViolet);
        colorCode.add(R.color.MediumPurple);
        colorCode.add(R.color.LightGreen);
        colorCode.add(R.color.DarkSeaGreen);
        colorCode.add(R.color.SaddleBrown);
        colorCode.add(R.color.DarkMagenta);
        colorCode.add(R.color.DarkRed);
        colorCode.add(R.color.BlueViolet);
        colorCode.add(R.color.LightSkyBlue);
        colorCode.add(R.color.SkyBlue);
        colorCode.add(R.color.Gray);
        colorCode.add(R.color.Olive);
        colorCode.add(R.color.Purple);
        colorCode.add(R.color.Maroon);
        colorCode.add(R.color.Aquamarine);
        colorCode.add(R.color.Chartreuse);
        colorCode.add(R.color.LawnGreen);
        colorCode.add(R.color.MediumSlateBlue);
        colorCode.add(R.color.LightSlateGray);
        colorCode.add(R.color.SlateGray);
        colorCode.add(R.color.OliveDrab);
        colorCode.add(R.color.SlateBlue);
        colorCode.add(R.color.DimGray);
        colorCode.add(R.color.MediumAquamarine);
        colorCode.add(R.color.CornflowerBlue);
        colorCode.add(R.color.CadetBlue);
        colorCode.add(R.color.DarkOliveGreen);
        colorCode.add(R.color.Indigo);
        colorCode.add(R.color.MediumTurquoise);
        colorCode.add(R.color.DarkSlateBlue);
        colorCode.add(R.color.SteelBlue);
        colorCode.add(R.color.RoyalBlue);
        colorCode.add(R.color.Turquoise);
        colorCode.add(R.color.MediumSeaGreen);
        colorCode.add(R.color.LimeGreen);
        colorCode.add(R.color.DarkSlateGray);
        colorCode.add(R.color.SeaGreen);
        colorCode.add(R.color.ForestGreen);
        colorCode.add(R.color.LightSeaGreen);
        colorCode.add(R.color.DodgerBlue);
        colorCode.add(R.color.MidnightBlue);
        colorCode.add(R.color.Aqua);
        colorCode.add(R.color.Cyan);
        colorCode.add(R.color.SpringGreen);
        colorCode.add(R.color.Lime);
        colorCode.add(R.color.MediumSpringGreen);
        colorCode.add(R.color.DarkTurquoise);
        colorCode.add(R.color.DeepSkyBlue);
        colorCode.add(R.color.DarkCyan);
        colorCode.add(R.color.Teal);
        colorCode.add(R.color.Green);
        colorCode.add(R.color.DarkGreen);
        colorCode.add(R.color.Blue);
        colorCode.add(R.color.MediumBlue);
        colorCode.add(R.color.DarkBlue);
        colorCode.add(R.color.Navy);

        Random random = new Random();
        int random_color = random.nextInt(colorCode.size());
        return colorCode.get(random_color);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class NotesViewHolder extends RecyclerView.ViewHolder {

    CardView notes_conteiner;
    TextView textView_title, textView_notes, textView_date;
    ImageView imageView_pin;

    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);

        notes_conteiner = itemView.findViewById(R.id.notes_conteiner);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_notes = itemView.findViewById(R.id.textView_notes);
        textView_date = itemView.findViewById(R.id.textView_date);
        imageView_pin = itemView.findViewById(R.id.imageView_pin);
    }
}
