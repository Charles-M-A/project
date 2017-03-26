package io.github.charly1811.bookexampledemo;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.google.api.services.books.model.Volume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cloubao on 1/20/16.
 */
public class BookListAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private final int spanCount;
    private List<Volume> volumes;

    public BookListAdapter(List<Volume> volumes, int spanCount) {
        this.volumes = volumes;
        this.spanCount = spanCount;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BookViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        holder.setSpanCount(spanCount);
        holder.setVolume(volumes.get(position));
    }

    @Override
    public long getItemId(int position) {
        return volumes.get(position).getId().hashCode();
    }

    @Override
    public int getItemCount() {
        return volumes.size();
    }
}
