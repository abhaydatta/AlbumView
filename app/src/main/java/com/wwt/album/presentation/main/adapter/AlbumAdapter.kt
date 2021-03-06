package com.wwt.album.presentation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wwt.album.data.model.Album
import com.wwt.album.databinding.ListItemAlbumBinding

class AlbumAdapter : RecyclerView.Adapter<AlbumAdapter.DataViewHolder>() {
    private val albums: MutableList<Album> = mutableListOf()

    class DataViewHolder(private val binding: ListItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.albumTitle.text = album.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            ListItemAlbumBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = albums.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(albums[position])

    fun addData(list: List<Album>) {
        albums.clear()
        albums.addAll(list)
        notifyDataSetChanged()
    }
}