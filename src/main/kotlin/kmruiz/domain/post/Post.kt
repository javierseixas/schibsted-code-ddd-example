package kmruiz.domain.post

import java.util.*

interface PostPublisher {
    fun publishPost(title: String, body: String): Post
}

interface Post {
    val author: Long
        get() = author

    val authorName: String
        get() = authorName

    val title: String
        get() = title

    val body: String
        get() = body
}
interface PendingPost: Post
interface PublishedPost: Post

data class SinglePendingPost(
        override val author: Long,
        override val authorName: String,
        override val title: String,
        override val body: String
): PendingPost

data class SinglePublishedPost(
        override val author: Long,
        override val authorName: String,
        override val title: String,
        override val body: String,
        val publicationDate: Date = Date()
): PublishedPost
