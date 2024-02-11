class PhotoAttachment(override val type: String, val photo: Photo): Attachment {
}

class Photo(val id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int) {

}