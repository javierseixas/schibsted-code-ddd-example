package kmruiz.domain.user

import kmruiz.domain.post.*
import java.util.*

interface User: PostPublisher, PostViewer {
    override fun selectPostIndex(startDate: Date) = PostViewIdQuery(startDate, 15)
}

interface Administrator: User

data class BlogUser(val id: Long, val name: String): User {
    override fun publishPost(title: String, body: String) = SinglePendingPost(id, name, title, body)
}

data class BlogAdministrator(val id: Long, val name: String): Administrator {
    override fun publishPost(title: String, body: String) = SinglePublishedPost(id, name, title, body)
}
