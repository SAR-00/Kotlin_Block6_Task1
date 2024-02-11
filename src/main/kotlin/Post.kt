data class Post (
    var id: Int = 0,
    val ownerId: Int = 0,
    val date: Int = 1000000000,
    val text: String = "Empty",
    val postType: String = "Post",
    val isPinned: Boolean = false,
    val markedAsAdd: Boolean = false,
    val comment: Comment?,
    val likes: Likes?,
    val attachment: Array<Attachment> = emptyArray()
) {


}