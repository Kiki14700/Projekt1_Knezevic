package knezevic.tvmaze;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<TVShow> TVShows;
    private LayoutInflater layoutInflater;
    private ItemClickInterface itemClickInterface;

    public AdapterListe(Context context){
        layoutInflater = LayoutInflater.from(context);
    }

    public void setTVShows(List<TVShow> TVShows) {
        this.TVShows = TVShows;
    }

    @NonNull
    @Override
    public Red onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.red_liste,parent,false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Red holder, int position) {
        TVShow TVShow = TVShows.get(position);
        holder.name.setText(TVShow.getName());
    }

    @Override
    public int getItemCount() {
        /*
        if (osobe==null){
            return 0;
        }else{
            return  osobe.size();
        }
        */
        return TVShows == null ? 0 : TVShows.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView name;


        public Red(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(itemClickInterface==null){
                return;
            }
            itemClickInterface.onItemClick(TVShows.get(getAdapterPosition()));
        }
    }

    public interface ItemClickInterface{
        void onItemClick(TVShow TVShow);
    }

    public void setItemClickInterface(ItemClickInterface itemClickInterface) {
        this.itemClickInterface = itemClickInterface;
    }
}
