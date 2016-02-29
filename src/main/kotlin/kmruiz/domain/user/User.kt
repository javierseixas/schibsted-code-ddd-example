package kmruiz.domain.user

import kmruiz.domain.post.PostPublisher
import kmruiz.domain.post.SinglePendingPost
import kmruiz.domain.post.SinglePublishedPost

interface User: PostPublisher
interface Administrator: User

data class BlogUser(val id: Long, val name: String): User {
    override fun publishPost(title: String, body: String) = SinglePendingPost(id, name, title, body)
}

data class BlogAdministrator(val id: Long, val name: String): Administrator {
    override fun publishPost(title: String, body: String) = SinglePublishedPost(id, name, title, body)
}
