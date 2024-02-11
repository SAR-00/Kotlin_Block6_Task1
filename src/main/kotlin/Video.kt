class VideoAttachment(override val type: String, val video: Video): Attachment {
}

class Video(val id: Int,
    val owner_id: Int,
    val title: String,
    val description: String,
    val duration: Int) {

}