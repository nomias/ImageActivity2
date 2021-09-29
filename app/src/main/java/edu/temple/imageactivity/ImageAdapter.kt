package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val context: Context, private val imageObj: Array<Image>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    class ImageViewHolder(_imageView: View): RecyclerView.ViewHolder(_imageView){
        val noteImg: ImageView = _imageView.findViewById(R.id.noteImg)
        val noteDesc: TextView = _imageView.findViewById(R.id.noteDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val imageView = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout,parent,false)
        return ImageViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val img = imageObj[position]
        holder.noteImg.setImageDrawable(AppCompatResources.getDrawable(context,img.resourceId))
        holder.noteDesc.text=img.desc
    }

    override fun getItemCount(): Int {
        return imageObj.size
    }
}