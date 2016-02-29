package kmruiz.domain.user

import kmruiz.domain.post.Post
import kmruiz.domain.post.PostPublisher

interface User
interface Administrator: User, PostPublisher

data class BlogAdministrator(val id: Long, val name: String): Administrator {
    override fun publishPost(title: String, body: String) = Post(id, name, title, body)
}
