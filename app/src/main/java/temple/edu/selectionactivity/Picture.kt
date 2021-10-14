package temple.edu.selectionactivity

//data class Picture(val name:String, val resourceId: Int)
data class Picture(val resourceId: Int, val description: String) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt(), parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) { parcel.writeInt(resourceId)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Picture> {
       override fun createFromParcel(parcel: Parcel): Picture {
            return Picture(parcel)
        }

        override fun newArray(size: Int): Array<Picture?> {
            return arrayOfNulls(size)
        }
   }
}

