package kmruiz.domain.post

interface PostRepository {
    fun savePost(post: Post): Post
}
