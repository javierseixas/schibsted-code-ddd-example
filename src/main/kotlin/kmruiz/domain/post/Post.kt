package kmruiz.domain.post

import java.util.*

interface PostPublisher {
    fun publishPost(title: String, body: String): Post
}

interface Post
interface PendingPost: Post
interface PublishedPost: Post

data class SinglePendingPost(val author: Long, val authorName: String, val title: String, val body: String): PendingPost
data class SinglePublishedPost(
        val author: Long,
        val authorName: String,
        val title: String,
        val body: String,
        val publicationDate: Date = Date()
): PublishedPost
