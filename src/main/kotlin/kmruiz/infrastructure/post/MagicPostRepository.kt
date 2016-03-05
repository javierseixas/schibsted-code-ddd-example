package kmruiz.infrastructure.post

import kmruiz.domain.post.Post
import kmruiz.domain.post.PostRepository

interface Magic {
    fun persist(post: Post): Post
    fun find(title: String): Post
}

data class MagicPostRepository(val magic: Magic): PostRepository {
    override fun findPost(title: String): Post = magic.find(title)

    override fun savePost(post: Post) = magic.persist(post)
}
