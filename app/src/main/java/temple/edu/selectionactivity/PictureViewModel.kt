package temple.edu.mainactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PictureViewModel : ViewModel(){
    private val Description: MutableLiveData<String> by lazy {MutableLiveData<String>()}
    private val DogImage by lazy {MutableLiveData<String>()}

    fun getPicture () : LiveData<String> {
        return DogImage
    }

    fun setPicture (_picture: Picture) {
        DogImage.value = _picture.toString()
    }
    fun getDescription () : LiveData<String> {
        return Description
    }

    fun setDescription (_dogName: String) {
        Description.value = _dogName
    }
}