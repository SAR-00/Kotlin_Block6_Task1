fun main() {

    val comment = Comment()
    val likes = Likes()
    val post1 = Post(ownerId = 1, comment = comment, likes = likes)
    val post2 = Post(ownerId = 2, comment = comment, likes = likes)
    val post3 = Post(id = 0, ownerId = 3, comment = comment, likes = likes)

    WallService.add(post1)
    WallService.add(post2)
    println(WallService.posts.joinToString())

    WallService.update(post3)
    println(WallService.posts.joinToString())

}