package edu.temple.imageactivity

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    class ImageViewHolder(_imageView: ImageView): RecyclerView.ViewHolder(_imageView){
        val imageView = _imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val imageView = ImageView(parent.context)
        return ImageViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}