package temple.edu.selectionactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(
    private val pictureList:List<Int>,
    private val nameList:List<String>,
    private val listener:PicData
): RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_listout,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(pictureList[position])
        holder.imageView.setOnClickListener(View.OnClickListener {
        listener.onImageClicked(nameList[position],pictureList[position])
        })
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.dog_image)

    }
    interface PicData {
        fun onImageClicked(name:String, image:Int)


    }
}
