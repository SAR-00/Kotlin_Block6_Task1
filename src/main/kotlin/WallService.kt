object WallService {

    var posts = emptyArray<Post>()
    private var postId = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts){
            if (post.id == postId) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("Post with id $postId not found")
    }

    fun clear() {
        posts = emptyArray()
        postId = 1
    }
}