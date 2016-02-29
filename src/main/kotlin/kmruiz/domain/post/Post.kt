package kmruiz.domain.post

interface PostPublisher {
    fun publishPost(title: String, body: String): Post
}

data class Post(val author: Long, val authorName: String, val title: String, val body: String)
