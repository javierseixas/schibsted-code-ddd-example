package kmruiz.domain.post

interface PostRepository {
    fun savePost(post: Post): Post

    fun findPost(title: String): Post
}
