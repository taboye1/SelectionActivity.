package temple.edu.selectionactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images:Array<Picture>,_ocListener: View.OnClickListener)
   : RecyclerView.Adapter<ImageAdapter.ViewHolder>(){

    //private val pictureList:List<Int>,
    //private val nameList:List<String>,
    //private val listener:PicData
       
    private val images = _images
    val listener = _ocListener

    class ViewHolder(_itemView: ImageView, listener: View.OnClickListener) : RecyclerView.ViewHolder(_itemView) {
        val imageView = _itemView.apply { setOnClickListener(listener) }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.item_listout,parent, false)
        //return ViewHolder(view)
        return ViewHolder(ImageView(parent.context).apply { layoutParams = ViewGroup.LayoutParams(200, 200) }, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.imageView.setImageResource(pictureList[position])
       //holder.imageView.setOnClickListener(View.OnClickListener {
       //listener.onImageClicked(nameList[position],pictureList[position])
       holder.imageView.setImageResource(images[position].resourceId)
   }

    override fun getItemCount(): Int {
        return images.size
    }
    //class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val imageView: ImageView = itemView.findViewById(R.id.dog_image)

    }
   // interface PicData {
        //fun onImageClicked(name:String, image:Int)


    //}
//}
