package digi.coders.recyclerviewlistcolor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

  private   int[] color={Color.GRAY,Color.RED,Color.GREEN};
    List<UserModel> userModels;
    Context context;

    public UserAdapter(List<UserModel> userModels, Context context) {
        this.userModels = userModels;
        this.context = context;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.backgound_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        UserModel userModel=userModels.get(position);
        holder.textview.setText(userModel.getName());
        holder.image.setImageResource(userModel.getImage());
        int colorbax=position % color.length;
        holder.background.setBackgroundColor(color[colorbax]);

    }

    @Override
    public int getItemCount() {
        return userModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout background;
        ImageView image;
        TextView textview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            background=itemView.findViewById(R.id.background);
            image=itemView.findViewById(R.id.imageview);
            textview=itemView.findViewById(R.id.textview);
        }
    }
}
