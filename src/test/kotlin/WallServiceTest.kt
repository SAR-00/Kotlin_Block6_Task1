import org.junit.Test
import org.junit.Before
import kotlin.test.assertEquals

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addTest() {
        val comment = Comment()
        val likes = Likes()
        var post = Post(comment = comment, likes = likes)

        WallService.add(post)
        post = WallService.posts[0]

        val result = post.id

        assertEquals(1, result)
    }

    @Test
    fun updateTest_True() {
        val comment = Comment()
        val likes = Likes()
        val post1 = Post(comment = comment, likes = likes)

        WallService.add(post1)

        val post2 = Post(id = 1, comment = comment, likes = likes)
        val result = WallService.update(post2)

        assertEquals(true, result)
    }

    @Test
    fun updateTest_False() {
        val comment = Comment()
        val likes = Likes()
        val post1 = Post(comment = comment, likes = likes)

        WallService.add(post1)

        val post2 = Post(id = 2, comment = comment, likes = likes)
        val result = WallService.update(post2)

        assertEquals(false, result)
    }

    @Test
    fun createCommentTest() {
        val comment = Comment("Миру мир, а мне пломбир")
        val likes = Likes()
        val post = Post(comment = comment, likes = likes)

        WallService.add(post)

        val result = WallService.createComment(1, comment)

        assertEquals(comment, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val comment = Comment("Миру мир, а мне пломбир")
        val likes = Likes()
        val post = Post(comment = comment, likes = likes)

        WallService.add(post)
        WallService.createComment(2, comment)
    }
}


